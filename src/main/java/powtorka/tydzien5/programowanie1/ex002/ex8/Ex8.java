/*
Napisz program, który sprawdza czy w podanej tablicy 3 liczny o indeksach n, n+1,
n+2 spełniają warunek x n -1 = x n = x n +1. Sygnatura metody sprawdzającej jest
następująca:
public boolean checkArray(int[] array)
Przygotuj testy jednostkowe sprawdzające działanie metody.
*/

package powtorka.tydzien5.programowanie1.ex002.ex8;

import java.lang.reflect.Array;

public class Ex8 {
    public static void main(String[] args) {
        int[] myArray = {6, 5, 4, 5, 4, 3, 2};
        System.out.println(checkArray(myArray));
    }

    public static boolean checkArray(int[] array) {
        boolean test = false;
        for (int i = 1; i < array.length - 1; i++) {
            int med = Array.getInt(array, i);
            if (med == (Array.getInt(array, i - 1) - 1)
                    && med == (Array.getInt(array, i + 1) + 1)) {
                test = true;
                break;
            }
        }
        return test;
    }
}
