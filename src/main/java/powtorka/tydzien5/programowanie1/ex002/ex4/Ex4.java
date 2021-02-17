/*
Napisz program, który sprawdza czy podane 2 tablice są identyczne. Sygnatura
metody sprawdzającej jest następująca
public boolean equals(int[] array1, int[] array2)
*/

package powtorka.tydzien5.programowanie1.ex002.ex4;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 3, 5, 6};
        int[] myArray2 = {1, 2, 3, 3, 5, 6};
        System.out.println(equals(myArray1, myArray2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }
}
