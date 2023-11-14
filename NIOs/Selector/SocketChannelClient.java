package NIOs.Selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
public class SocketChannelClient {
    public static void main(String[] args) throws IOException,
    InterruptedException {

        InetSocketAddress serverAddress = new InetSocketAddress("localhost",6666);
        SocketChannel client = SocketChannel.open(serverAddress);
        System.out.println("Client will be sending messages.....");
        String [] messages = new String [] {"First Message.", "Second Message","bye"};

        for (int i = 0; i < messages.length; i++) {
            byte [] message = messages [i].getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(message);
            client.write(buffer);
            System.out.println(messages [i]);
            buffer.clear();
            Thread.sleep(5000);
        }
        client.close();
    }
}
