/*
Utwórz nieposortowaną kolekcję z 10 dowolnymi i unikatowymi imionami.
Korzystając ze strumieni posortuj kolekcję i wyświetl ją.
*/

package powtorka.tydzien5.programowanie1.ex001.streams.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList
                ("Tom", "Bob", "Ann", "Jil", "Mary", "Jan", "Jack", "Robo", "Annie", "WERT"));
        System.out.println("names: " + names);
        names.stream()
                .sorted()
                .forEach(s -> System.out.println(s));

        names.stream()
                .sorted(Collections.reverseOrder())
                .forEach(s -> System.out.println(s));
    }
}
