package powtorka.tydzien5.programowanie1.ex009.ex6;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ShowFilesFromDirectories {

    private List<String> listOfFiles;

    public ShowFilesFromDirectories() {
        this.listOfFiles = new ArrayList<>();
    }

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

    public List<String> listFilesForFolder2(File folder, int depth) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                if (depth > 0) {
                    depth--;
                    System.out.println("files in: " + fileEntry.getAbsolutePath());
                    listFilesForFolder2(fileEntry, depth);
                }
            } else {
                System.out.println(fileEntry.getName() + " " + fileEntry.length() / 1024 + " KB");
                listOfFiles.add(fileEntry.getName() + " " + fileEntry.length() / 1024 + " KB");
            }
        }
        return listOfFiles;
    }
}
