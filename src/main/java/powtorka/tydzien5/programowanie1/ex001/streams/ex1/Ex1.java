/*
Utwórz kolekcję, a następnie dodaj do niej 5 imion. Korzystając z Stream zmodyfikuj
kolekcję tak, aby imiona były pisane dużymi literami (UPPERCASE), a następnie
wyświetl wszystkie imiona.
*/

package powtorka.tydzien5.programowanie1.ex001.streams.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Bob", "Ann", "Jil", "Mary"));
        names.stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
    }
}
