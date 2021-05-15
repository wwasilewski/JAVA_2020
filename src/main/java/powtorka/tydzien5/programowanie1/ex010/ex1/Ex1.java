/*
Utwórz listę List<String> a następnie dodaj 5 imion do kolekcji. Korzystając z metody
  foreach listy oraz wyrażenia lambda wyświetl wszystkie imiona znajdujące się na
li ście.
*/

package powtorka.tydzien5.programowanie1.ex010.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Jerry", "Kate", "Mary", "Rob"));

        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
