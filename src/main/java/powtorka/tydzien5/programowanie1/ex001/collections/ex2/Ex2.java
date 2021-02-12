/*
Dodaj 10 losowych liczb do kolekcji. Korzystając z indeksów pobierz pokolei
wszystkie elementy i wyświetl je.
*/

package powtorka.tydzien5.programowanie1.ex001.collections.ex2;

import powtorka.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2 {
    private static final Random random = new Random();
    private static final List<Integer> listOfNumbers = new ArrayList<>();

    public static void main(String[] args) {
        Utils.displayTextOnConsole(String.valueOf(addNumbersToList()));
        printNumbers();
    }

    public static List<Integer> addNumbersToList() {
        while (listOfNumbers.size() < 10) {
            listOfNumbers.add(random.nextInt(10) + 1);
        }
        return listOfNumbers;
    }

    public static void printNumbers() {
        for (Integer numbers : listOfNumbers) {
            System.out.println(numbers);
        }
    }
}
