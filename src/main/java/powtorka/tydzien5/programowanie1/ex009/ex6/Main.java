package powtorka.tydzien5.programowanie1.ex009.ex6;

import powtorka.TextColor;
import powtorka.Utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        var lf = new ListFilesFromDirectories();
        var saveToFile = new SaveFileListFromDirectoryToFile();

        String pathToDir = Utils.displayTextAndGetValue("provide path: ", true);
        Integer depthToCheck = Utils.displayTextAndGetInt("provide depth to check: ");
        String fileExtension = Utils.displayTextAndGetValue("provide file-extension," +
                " ie txt or pdf (\"n\" if not needed)", true);
        String fileToSave = Utils.displayTextAndGetValue("provide filepath to save " +
                "(\"n\" if not needed)", true);

        if (fileExtension.equals("n")) {
            fileExtension = "";
        }
        List<String> list = lf.listFilesFromDir(new File(pathToDir), depthToCheck, fileExtension);
        Utils.displayTextOnConsole("all files from main dir " + pathToDir, TextColor.ANSI_BLUE);
        lf.printAllFilesFromDir((new File(pathToDir)));

        if (!fileToSave.equals("n")) {
            saveToFile.saveToFile(fileToSave, String.valueOf(list));
        }
    }
}
