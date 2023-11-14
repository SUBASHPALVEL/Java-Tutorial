package NIOs.Channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class FileReceiver {
    public static void main(String[] args) throws IOException {

        System.out.println("File Receiver is ready for accepting connections....");
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
        serverSocket.socket().bind(new InetSocketAddress("localhost",6666));
        // Binds the ServerSocket to a specific endpoint which is the
        // combination of IP address and port number.

        // To accept connection from the client, we need create a socket
        // channel by calling accept() method of the serverSocket object.
        SocketChannel client  =serverSocket.accept();

        System.out.println("A connection established with the client:  " + client.getRemoteAddress());

        Path path = Paths.get("NIOs/Channel/myfile.txt");

        FileChannel fileChannel = FileChannel.open(path,
                EnumSet.of(StandardOpenOption.CREATE,
                        StandardOpenOption.TRUNCATE_EXISTING,
                        StandardOpenOption.WRITE)
        );

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while(client.read(buffer) > 0) {
            buffer.flip();
            fileChannel.write(buffer);
            buffer.clear();
        }

        fileChannel.close();
        client.close();

        System.out.println("File Received");
    }
}
