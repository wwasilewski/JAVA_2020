package powtorka.tydzien5.programowanie1.ex009.ex6;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        String pathToDir = Utils.displayTextAndGetValue("provide path: ", true);
//        Integer depthToCheck = Utils.displayTextAndGetInt("provide depth to check: ");
        var showFiles = new ShowFilesFromDirectories();
//        Utils.displayTextOnConsole("main dir: " + pathToDir, TextColor.ANSI_BLUE);
//        showFiles.listFilesForFolder(new File(pathToDir), depthToCheck);

        //to powyzej dziala

        List<String> list = showFiles.listFilesForFolder2(new File("D://test"), 2);
//        for (String l : list) {
//            System.out.println(l);
//        }
    }
}
