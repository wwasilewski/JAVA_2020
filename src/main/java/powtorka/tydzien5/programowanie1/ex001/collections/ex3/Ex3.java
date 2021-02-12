/*
Utwórz kolejkę osób do lekarza. Dodaj 10 losowych osób i wyświetl pierwsza i
ostatnią osobę z kolejki. Nie korzystaj z listy ArrayList.
*/

package powtorka.tydzien5.programowanie1.ex001.collections.ex3;

import powtorka.Utils;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Ex3 {
    public static void main(String[] args) {
        String[] arrayOfPeople = new String[]{"John", "Tom", "Ann", "Mary", "Jack", "Claire", "Bob", "Jil", "Bill", "Rob", "Lig"};
        Deque<String> people = new ArrayDeque<>(Arrays.asList(arrayOfPeople));
        Utils.displayTextOnConsole("first: " + people.getFirst());
        Utils.displayTextOnConsole("last: " + people.getLast());
    }
}
