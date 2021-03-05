package powtorka.tydzien5.programowanie1.ex009.ex6;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListFilesFromDirectories {

    private final List<String> listOfFiles;

    public ListFilesFromDirectories() {
        this.listOfFiles = new ArrayList<>();
    }

    public List<String> listFilesFromDir(File dir, int depth, String fileExtension) {
        for (File fileEntry : dir.listFiles()) {
            if (fileEntry.isDirectory() && depth > 0) {
                depth--;
                listFilesFromDir(fileEntry, depth, fileExtension);
            } else {
                if (fileEntry.getName().endsWith(fileExtension)) {
                    listOfFiles.add(fileEntry.getName() + " " + fileEntry.length() / 1024 + " KB");
                }
            }
        }
        return listOfFiles;
    }

    public void printAllFilesFromDir(File dir) {
        for (File fileEntry : dir.listFiles()) {
            if (fileEntry.isDirectory()) {
                System.out.println("files in dir: " + fileEntry.getAbsolutePath());
                printAllFilesFromDir(fileEntry);
            } else {
                System.out.println(fileEntry.getName() + " " + fileEntry.length() / 1024 + " KB");
            }
        }
    }
}
