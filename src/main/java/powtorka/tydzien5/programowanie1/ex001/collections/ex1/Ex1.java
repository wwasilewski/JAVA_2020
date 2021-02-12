/*
Dodaj 5 imion do kolekcji. Wybierz tą kolekcję, która posortuje wprowadzone
wartości. Po dodaniu elementów wyświetl wszystkie.
*/

package powtorka.tydzien5.programowanie1.ex001.collections.ex1;

import powtorka.Utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jack", "Ann", "Maria", "Jenny");
        Collections.sort(names);
//      reverse order
//      Collections.sort(names,Collections.reverseOrder());
        Utils.displayTextOnConsole(names.toString());
    }
}
