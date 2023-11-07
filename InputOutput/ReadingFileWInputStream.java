package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileWInputStream {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("InputOutput/input.txt");
            int byteCount;

            byte[] dataChunk = new byte[16];

            StringBuilder stringBuilder= new StringBuilder();

            while((byteCount= fileInputStream.read(dataChunk))!=-1) {

                stringBuilder.append((new String(dataChunk,0,byteCount)));
            }

            String fileDataString= new String(stringBuilder);

            System.out.println("File Content: "+fileDataString);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
