/*
Jesteś firmą produkującą tabliczki z imionami. Dla każdego imienia musisz
przygotować matrycę. Raz przygotowana matryca może być wykorzystywana
wielokrotnie. Korzystając z odpowiedniej kolekcji dodaj do niej imiona (co najmniej
10) osób tak aby w kolekcji się nie powtarzały. Podczas dodawania dodaj kilka imion
powtarzających się.
*/

package powtorka.tydzien5.programowanie1.ex001.collections.ex4;

import powtorka.Utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex4 {
    public static void main(String[] args) {
        String[] primaryNames = new String[]{"Tom", "Bob", "Ann", "Tom", "Jack", "Mir", "Jil", "Bar", "Tom", "Tom"};
        Utils.displayTextOnConsole("primary names: " + Arrays.toString(primaryNames));
        Set<String> names = new HashSet<>(Arrays.asList(primaryNames));
        Utils.displayTextOnConsole("names in set: " + names);

        while (true) {
            String name = Utils.displayTextAndGetValue("add a name, \"end\" is end:", true);
            if (name.equals("end")) {
                break;
            }
            names.add(name);
        }
        Utils.displayTextOnConsole("final set: " + names.toString());
    }
}
