/*
1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `numbers`.
2. Stwórz zmienną tablicową `reverse` i umieść w niej elementy tablicy numbers w odwrotnej kolejności.
3. Wypisz na konsoli elementy z odwróconej tablicy.
Dla tablicy o elementach:
3, 5, 7, 2, 1
Wypisze:
1, 2, 7, 5, 3
*/

package powtorka.coderslab.day1.arrays.ex4;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverse = reverseArray(numbers);
        System.out.println(Arrays.toString(reverse));
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}
