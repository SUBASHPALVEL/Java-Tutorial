package NIOs.Gather;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;

public class Main {

    public static void main(String[] args) throws IOException {

        String textA = "1,2,3,4,5,6,7,8,";
        String textB = "9,10,11,12,13,14.";
        ByteBuffer byteBufferA = ByteBuffer.allocate(16);
        ByteBuffer byteBufferB = ByteBuffer.allocate(16);

        ByteBuffer byteStreamA = ByteBuffer.wrap(textA.getBytes());
        ByteBuffer byteStreamB = ByteBuffer.wrap(textB.getBytes());

        FileOutputStream out = new FileOutputStream("NIOs/Gather/output.txt");
        GatheringByteChannel gather = out.getChannel();
        byteBufferA.position(0);
        byteBufferB.position(0);
        gather.write(new ByteBuffer[]{ byteStreamA, byteStreamB});
        out.close();
        gather.close();

    }
}
