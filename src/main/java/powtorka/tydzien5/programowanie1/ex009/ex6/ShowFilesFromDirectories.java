package powtorka.tydzien5.programowanie1.ex009.ex6;

import java.io.File;

public class ShowFilesFromDirectories {

    public void listFilesForFolder(File folder, int depth) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                if (depth > 0) {
                    --depth;
                    System.out.println("files in: " + fileEntry.getAbsolutePath());
                    listFilesForFolder(fileEntry, depth);
                }
            } else {
                System.out.println(fileEntry.getName() + " " + fileEntry.length() / 1024 + " KB");
            }
        }
    }
}
