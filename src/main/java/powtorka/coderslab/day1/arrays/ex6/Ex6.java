/*
1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `numbers`.
2. Stwórz drugą tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `secondNumbers`.
3. Stwórz trzecią tablicę zawierającą sumę wszystkich kolejnych elementów.
Dla przykładowych tablic:
int[] numbers = {2, 3};
int[] secondNumners = {3, 4};
wynikiem będzie tablica o elementach `5 i 7` .
*/

package powtorka.coderslab.day1.arrays.ex6;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] secondNumbers = {7, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(sumNumbersOfTwoArrays(numbers, secondNumbers)));
    }

    public static int[] sumNumbersOfTwoArrays(int[] array1, int[] array2) {
        int[] summedArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            summedArray[i] = array1[i] + array2[i];
        }
        return summedArray;
    }
}
