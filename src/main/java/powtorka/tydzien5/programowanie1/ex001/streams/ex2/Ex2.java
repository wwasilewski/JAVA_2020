/*
Utwórz kolekcję z 10 imionami (W kolekcji musi pojawić się imię Jan). Korzystając
ze strumieni znajdź imię Jan i wyświetl je.
*/

package powtorka.tydzien5.programowanie1.ex001.streams.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Tom", "Bob", "Ann", "Jil", "Mary", "Jan", "Jack", "Robo", "Annie", "WERT"));
        names.stream()
                .filter(s -> s.equals("Jan"))
                .forEach(System.out::println);
    }
}
