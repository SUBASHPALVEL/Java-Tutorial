package NIOs.Paths;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/subash/MyFiles/poem.txt");
        System.out.println("Path: "+path);
        FileSystem fileSystem =  path.getFileSystem();
        System.out.println("file system: "+fileSystem);
        System.out.println("Is Absolute: "+path.isAbsolute());
        System.out.println("File Name: "+path.getFileName());
        System.out.println("Root Path: "+path.getRoot());
        System.out.println("Parent Path: "+path.getParent());
        System.out.println("Number of names: "+path.getNameCount());
        System.out.println("Names at 0: "+path.getName(0));
        System.out.println("subpath(0,2):"+path.subpath(0, 3));
    }
}
