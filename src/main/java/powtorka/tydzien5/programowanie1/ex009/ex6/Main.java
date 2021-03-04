package powtorka.tydzien5.programowanie1.ex009.ex6;

import powtorka.TextColor;
import powtorka.Utils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathToDir = Utils.displayTextAndGetValue("provide path: ", true);
        Integer depthToCheck = Utils.displayTextAndGetInt("provide depth to check: ");
        var showFiles = new ShowFilesFromDirectories();
        Utils.displayTextOnConsole("main dir: " + pathToDir, TextColor.ANSI_BLUE);
        showFiles.listFilesForFolder(new File(pathToDir), depthToCheck);
    }
}
