package InputOutput;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileWFileReader {

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("output.txt");
            String textData = "I am the villian";
            fileWriter.write(textData);
        }  catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
