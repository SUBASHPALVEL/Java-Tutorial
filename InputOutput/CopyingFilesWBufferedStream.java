package InputOutput;

import java.io.*;

public class CopyingFilesWBufferedStream {

    public static void main(String[] args) {

        try (
                FileInputStream sourceFile = new FileInputStream("InputOutput/Subash.jfif");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(sourceFile);
                FileOutputStream targetFile = new FileOutputStream("InputOutput/Copy_Subash.jfif");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(targetFile)) {
            byte[] buffer = new byte[4096];
            int numBytes;
            while ((numBytes = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, numBytes);
            }
        } catch (IOException ex) {
            System.err.format("I/O error: %s%n", ex);
        }
    }
}
