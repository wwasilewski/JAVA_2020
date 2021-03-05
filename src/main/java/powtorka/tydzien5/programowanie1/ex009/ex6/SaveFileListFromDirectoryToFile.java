package powtorka.tydzien5.programowanie1.ex009.ex6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveFileListFromDirectoryToFile {

    public void saveToFile(String path, String file) {
        try (var bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm:ss"))
                    + " fileList: " + file + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
