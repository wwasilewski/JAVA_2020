package powtorka.tydzien5.programowanie1.ex001.threads.ex5;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DataLists {
    public static List<String> firstnames = new ArrayList<>();
    public static List<String> lastnames = new ArrayList<>();

    public DataLists() {
        firstnames.add("Name1");
        firstnames.add("Name2");
        firstnames.add("Name3");
        firstnames.add("Name4");
        firstnames.add("Name5");
        firstnames.add("Name6");
        firstnames.add("Name7");
        firstnames.add("Name8");
        firstnames.add("Name9");
        firstnames.add("Name10");

        lastnames.add("surname1");
        lastnames.add("surname2");
        lastnames.add("surname3");
        lastnames.add("surname4");
        lastnames.add("surname5");
        lastnames.add("surname6");
        lastnames.add("surname7");
        lastnames.add("surname8");
        lastnames.add("surname9");
        lastnames.add("surname10");
    }
}
