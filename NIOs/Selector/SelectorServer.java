package NIOs.Selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectorServer {

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        System.out.println("Is Selector Open: " + selector.isOpen());

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        InetSocketAddress socketAddress = new InetSocketAddress("localhost",6666);
        serverSocketChannel.bind(socketAddress);

        // The Channel must be in non-blocking mode to be used with a Selector. 
        serverSocketChannel.configureBlocking(false);

        // We need valid operation set that is supported by the server socket channel.
        int ops = serverSocketChannel.validOps();

        // In order to use a Channel with a Selector you must register the Channel with the Selector.
        SelectionKey selectKy = serverSocketChannel.register(selector, ops);

        while (true) {
            System.out.println("Waiting for select...");

            // select() method return the channels that are "ready" for the events
            int noOfKeys = selector.select();
            System.out.println("Number of selected keys: " + noOfKeys);
            Set selectedKeys = selector.selectedKeys();
            Iterator iterator = selectedKeys.iterator();

            while (iterator.hasNext()) {

                SelectionKey selectionKey = (SelectionKey) iterator.next();

                if (selectionKey.isAcceptable()) {
                    SocketChannel client = serverSocketChannel.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_READ);
                    System.out.println("Accepted new connection from client: " + client);

                } else if (selectionKey.isReadable()) {
                    SocketChannel client = (SocketChannel) selectionKey.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(256);
                    client.read(buffer);
                    String message = new String(buffer.array()).trim();
                    System.out.println("Message read from client: " + message);

                    if (message.equalsIgnoreCase("bye")) {
                        client.close();
                        System.out.println("Channel closed");
                    }

                }
                iterator.remove();

            }

        }

    }
}
