/*
1. Stwórz tablicę z 20 losowymi liczbami z zakresu `0-100`, zmienną z tablicą nazwij `randNumbers`
2. Użyj do tego pętli `for` - do otrzymania losowej wartości użyj sposobu opisanego w snippetach.
3. Wypisz w konsoli minimalną wartość z tablicy.
*/

package powtorka.coderslab.day1.arrays.ex2;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randNumbers = new int[20];
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(randNumbers));
        Arrays.sort(randNumbers);
        System.out.println(randNumbers[0]);
    }
}
