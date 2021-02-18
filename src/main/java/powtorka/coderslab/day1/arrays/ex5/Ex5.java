/*
1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `numbers`.
2. Posortuj tablicę wykorzystując metody klasy Arrays.
3. Wyświetl w konsoli posortowaną tablicę - również wykorzystaj metodę klasy Arrays.
*/

package powtorka.coderslab.day1.arrays.ex5;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
