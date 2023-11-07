package InputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiles {

    public static void main(String[] args) throws IOException {

        String filePath="InputOutput/randomAccessInput.txt";
        FileWriter fileWriter= new FileWriter(filePath);
        fileWriter.write("Java and Scala");
        fileWriter.close();

        RandomAccessFile raf = new RandomAccessFile(filePath, "rw");

        raf.seek(9);
        raf.writeBytes("Python");

        raf.seek(0);
        System.out.println(raf.readLine());
        System.out.println(raf.getFilePointer());

        raf.writeBytes(" are ");
        raf.writeInt(2);
        System.out.println(raf.getFilePointer());
     
        raf.writeBytes(" languages with the popularity of ");
        System.out.println(raf.getFilePointer());

        raf.writeDouble(92.78);
        System.out.println(raf.getFilePointer());

        raf.seek(raf.length() - 8);
        System.out.println(raf.readDouble());

        raf.close();
    }
}
