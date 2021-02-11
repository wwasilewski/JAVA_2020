/*
Przygotuj program losujący 20 liczb całkowitych. Program musi pamiętać
wylosowane liczby i jeśli liczba wylosowana się powtórzyła następuje ponowne
losowanie, aż do wylosowania liczby unikalnej.
*/

package powtorka.tydzien5.programowanie1.ex001.general.ex3;

import powtorka.Utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        String numbers = generateUniqueNumbers(20).toString();
        Utils.displayTextOnConsole(numbers);
    }

    public static Set<Integer> generateUniqueNumbers(int n) {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < n) {
            numbers.add(random.nextInt(100) + 1);
        }
        return numbers;
    }
}
