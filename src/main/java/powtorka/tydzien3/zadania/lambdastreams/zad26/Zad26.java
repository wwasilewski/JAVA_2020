/*
Przygotuj tablice z 10 różnymi imionami. Posortuj tablicę według
a. długości rosnąco
b. długości malejąco
c. pierwszej litery imienia rosnąco - wykorzystaj metodą charAt
*/

package powtorka.tydzien3.zadania.lambdastreams.zad26;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Zad26 {

    private String[] names = {"Tom", "Mary", "Ann", "Jack", "Anton", "Bob", "Jerry", "Monica", "Ross", "Joe"};

    public void sortByNameLengthAsc() {
        System.out.println("names by length ascending:");
        List<String> sortedNames = stream(names)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        sortedNames.forEach(s -> System.out.println(s));
    }

    public void sortByNameLengthDesc() {
        System.out.println("names by length descending:");
        List<String> sortedNames = stream(names)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
        sortedNames.forEach(s -> System.out.println(s));
    }

    public void sortByFirstLetter() {
        System.out.println("names by first letter:");
        List<String> sortedNames = stream(names)
                .sorted(Comparator.comparingInt(n -> n.charAt(0)))
                .collect(Collectors.toList());
        sortedNames.forEach(s -> System.out.println(s));
    }
}
