package InputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileClass {

    public static void main(String[] args) throws IOException {

        File myFilesFolder = new File("InputOutput/MyFiles");

        File[] files = myFilesFolder.listFiles();

        for (File file : files) {
            System.out.println("Absolute Path: " + file.getAbsolutePath().toUpperCase());
            System.out.println("Is Directory:" + file.isDirectory());
            System.out.println("Length: " + file.length() / 1024 + " KB");
            System.out.println("Is Hidden:" + file.isHidden());

            if (file.canRead()) {
                if (file.getName().indexOf(".txt") >= 0) {
                    RandomAccessFile raf = new RandomAccessFile(file, "r");
                    System.out.println("First Line:" + raf.readLine());
                    raf.close();
                }
            }
            System.out.println("--------------------------------------------");
            
        }

        File mySubFolder = new File("InputOutput/MyFiles/MySubfolder");
        mySubFolder.mkdir();

        File newTextFile = new File(mySubFolder.getAbsolutePath() + "/newTextFile.txt");

        FileWriter fileWriter = new FileWriter(newTextFile);
        fileWriter.write("This is a demonstration of File class");
        fileWriter.close();

        // Now we can delete our newTextFile.txt using delete() method.
        if (newTextFile.delete())
            System.out.println(newTextFile + " was deleted..........");

        // And delete subfolder MySubfolder using delete() method.
        if (mySubFolder.delete())
            System.out.println(myFilesFolder + " was deleted.........");

    }
}

