/*
Wylosuj 1000 liczb z zakresu 1000-2000 i zapisz je do listy. Skorzystaj z stream() w
liście do wyszukania najmniejszej i największej wartości.
*/

package powtorka.tydzien5.programowanie1.ex001.general.ex6;

import powtorka.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex6 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> numbers = listOfNumbers();
        Utils.displayTextOnConsole(numbers.toString());
        numbers.stream()
                .sorted()
                .limit(1)
                .forEach(e -> System.out.println("min: " + e));

        numbers.stream()
                .sorted(Collections.reverseOrder())
                .limit(1)
                .forEach(e -> System.out.println("max: " + e));
    }

    public static List<Integer> listOfNumbers() {
        List<Integer> listOfNumbers = new ArrayList<>();
        while (listOfNumbers.size() < 1000) {
            listOfNumbers.add(random.nextInt(1001) + 1000);
        }
        return listOfNumbers;
    }
}
