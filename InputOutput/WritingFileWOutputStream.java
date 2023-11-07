package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFileWOutputStream {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("InputOutput/output.txt");
            String textData = "Sir, only sir";
            byte[] byteData = textData.getBytes();
            fileOutputStream.write(byteData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
