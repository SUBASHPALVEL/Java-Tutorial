package NIOs.Scatter;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ScatteringByteChannel;

public class Main {
    public static void main(String[] args) throws IOException {
        ByteBuffer byteBufferA = ByteBuffer.allocate(16);
        ByteBuffer byteBufferB = ByteBuffer.allocate(16);

        ByteBuffer[] byteBuffers={byteBufferA,byteBufferB};

        FileInputStream in = new FileInputStream("NIOs/Scatter/input.txt");
        ScatteringByteChannel scatter = in.getChannel();

            while(scatter.read(byteBuffers)>0) {
                byteBufferA.position(0);
                byteBufferB.position(0);
                System.out.print("byteBufferA:");

                while (byteBufferA.hasRemaining()) {

                    System.out.print((char) byteBufferA.get());

                }
                System.out.println();
                System.out.print("byteBufferB:");
                while (byteBufferB.hasRemaining()) {
                    System.out.print((char) byteBufferB.get());
                }
                System.out.println();

                // To prepare byteBufferA and byteBufferB for next reading
                // iteration, we set their positions to 0.
                byteBufferA.position(0);
                byteBufferB.position(0);

        }

    }
}
