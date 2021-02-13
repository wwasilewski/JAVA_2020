/*
Utwórz kolekcję z 6 liczbami. Korzystając z strumieni znajdź maksymalną i
minimalną liczbę znajdującą się w kolekcji.
*/

package powtorka.tydzien5.programowanie1.ex001.streams.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        numbers.stream()
                .sorted(Collections.reverseOrder())
                .limit(1)
                .forEach(i -> System.out.println("max: " + i));
        numbers.stream()
                .sorted()
                .limit(1)
                .forEach(i -> System.out.println("min: " + i));
    }
}
