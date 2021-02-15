package powtorka.tydzien5.programowanie1.ex001.threads.ex5;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DataLists {
    public static List<String> firstnames = new ArrayList<>();
    public static List<String> lastnames = new ArrayList<>();

    public DataLists() {
        for (int i = 1; i < 11; i++) {
            firstnames.add("name" + i);
            lastnames.add("lastname" + i);
        }
    }
}
