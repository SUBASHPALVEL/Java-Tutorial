package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileWFileReader {

    public static void main(String[] args) {

        FileReader fileReader = null;

        try {

            fileReader = new FileReader("InputOutput/input.txt");
            int myChar;

            while ((myChar = fileReader.read()) != -1) {
                System.out.print((char)myChar);

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
