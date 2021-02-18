/*
1. Stwórz 10 elementową tablicę wypełnioną pojedynczą wartością 2.
2. Zadanie wykonaj bez użycia pętli for.
*/

package powtorka.coderslab.day1.arrays.ex3;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array, 2);
        System.out.println(Arrays.toString(array));
    }
}
