/*
Utwórz listę ArrayList przechowującą liczby całkowite.
a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
b. Wyświetl pierwszy element zapisany w liście.
c. Wyświetl ostatni element zapisany w liście
*/

package powtorka.tydzien2.zadania.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Zad2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        System.out.println("array's length: " + numbers.size());
        System.out.println("first element: " + numbers.get(0));
        System.out.println("last element: " + numbers.get(numbers.size() - 1));
    }
}
