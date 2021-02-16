package powtorka.tydzien5.programowanie1.ex001.threads.ex5;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SavePersonDataInFile {
    private static final String PATHTODIRECTORY = "C:\\Users\\wwasi\\Desktop\\Java_2020\\logs\\";
    private String nameOfFile;
    private Person person;

    public SavePersonDataInFile(Person person, String fileName) {
        this.person = person;
        this.nameOfFile = PATHTODIRECTORY + fileName + ".json";
    }

    public void saveFileInDirectory() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nameOfFile));
        JSONObject jo = new JSONObject(person);
        bw.write(jo.toString());
        bw.close();
    }
}
