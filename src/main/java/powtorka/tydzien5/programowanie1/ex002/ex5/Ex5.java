/*
Napisz program, który zwraca kopię podanej tablicy. Sygnatura metody kopiującej
jest następująca: public int[] copyArray(int[] array)
*/

package powtorka.tydzien5.programowanie1.ex002.ex5;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        int[] copiedArray = copyArray(myArray);
        System.out.println(Arrays.toString(copiedArray));
        System.out.println("0 = arrays equal, result: " + Arrays.compare(myArray, copiedArray));
    }

    public static int[] copyArray(int[] array) {
        return array.clone();
    }
}
