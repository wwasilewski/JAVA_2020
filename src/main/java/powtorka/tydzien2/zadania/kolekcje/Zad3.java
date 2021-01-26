/*
Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
liczb do listy.
a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.
*/

package powtorka.tydzien2.zadania.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Zad3 {
    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        numbers.add(1d);
        numbers.add(2d);
        numbers.add(3d);
        numbers.add(4d);
        numbers.add(5d);
        numbers.add(6d);
        numbers.add(7d);
        numbers.add(8d);
        numbers.add(9d);
        numbers.add(10d);

        System.out.println("first+last number = " + (numbers.get(0) + numbers.get(numbers.size() - 1)));
        System.out.println("first*last number = " + (numbers.get(0) * numbers.get(numbers.size() - 1)));
        System.out.println("second/second to last number = " + (numbers.get(1) / numbers.get(numbers.size() - 2)));
    }
}
