package powtorka.tydzien5.programowanie1.ex006.ex7;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter
                    ("C:\\Users\\wwasi\\Desktop\\Java_2020\\logs\\ex7-ex006.txt", true));
            bw.write("provided name: " + message + "\n");
            log.info(message + " saved to file");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
