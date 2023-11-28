package NIOs.Pipes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class Main {

    public static void main(String[] args) throws IOException {

        Pipe pipe = Pipe.open();
        Pipe.SinkChannel sinkChannel = pipe.sink();
        ByteBuffer sinkBuffer = ByteBuffer.allocate(16);

        for (int i = 1; i <= 5; i++) {
            String message = "Message " + i + ", ";
            sinkBuffer.clear();
            sinkBuffer.put(message.getBytes());
            sinkBuffer.flip();
            sinkChannel.write(sinkBuffer);
        }

        Pipe.SourceChannel sourceChannel = pipe.source();
        ByteBuffer sourceBuffer = ByteBuffer.allocate(16);
        while (sourceChannel.read(sourceBuffer) > 0) {
            sourceBuffer.flip();
            while (sourceBuffer.hasRemaining()) {
                char c = (char) sourceBuffer.get();
                System.out.print(c);
            }

            sourceBuffer.clear();
        }

    }
}
