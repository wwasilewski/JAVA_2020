package powtorka.tydzien5.programowanie1.listingfiles.walkmethod;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        var fw = new FilesWalkMethodExamples();
        String path = "D:\\test";
        List<String> fileList = fw.listFilesUsingFilesWalk(path);
        System.out.println("Files.walk(): " + fileList);

        fileList = fw.listFilesUsingFilesWalk(path, 2);
        System.out.println("Files.walk() with depth = 2: " + fileList);

        fileList = fw.listDirectoriesUsingFilesWalk(path);
        System.out.println("printing only directories: " + fileList);

        fileList = fw.listFilesByExtensionUsingFilesWalk(path, "txt");
        System.out.println("printing files by extension \".txt\": " + fileList);
    }
}
