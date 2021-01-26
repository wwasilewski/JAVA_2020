/*
Utwórz listę ArrayList przechowującą imiona.
a. Dodaj 5 imion do listy,
b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
zaczynając od ostatniego, a kończąc na pierwszym.
*/

package powtorka.tydzien2.zadania.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Ann");
        names.add("Mary");
        names.add("Bob");

        for (String s : names) {
            System.out.println(s);
        }

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
    }
}
