/*
Utwórz listę ArrayList przechowującą liczby całkowite.
a. Dodaj 5 liczb do listy.
b. Pobierz 6 element z listy.
c. Uruchom aplikację i sprawdź co pokaże IntelliJ w logach oraz w stacktrace.
d. Zabezpiecz kod za pomocą klauzuli try catch.
e. W przypadku wystąpienia błędu wyświetl stosowny komunikat.
*/

package powtorka.tydzien2.zadania.wyjatki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad7 {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 1));
        try {
            System.out.println(listOfNumbers.get(5));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
