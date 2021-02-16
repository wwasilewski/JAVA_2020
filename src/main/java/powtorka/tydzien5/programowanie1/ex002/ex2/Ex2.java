/*
Napisz program zwracający tablicę w następującym formacie tekstowym { x1, x2, x3, x4, x5, x6 }
Metoda wyświetlająca tablicę ma następującą sygnaturę
public String printArray(int[] array)
*/

package powtorka.tydzien5.programowanie1.ex002.ex2;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        System.out.println(printArray(myArray));
    }

//    public static String printArray(int[] array) {
//        String strings = Arrays.toString(array)
//                .replace("[", "{ ")
//                .replace("]", " }")
//                .replace(" ", " x")
//                .replace("x6 x", "x6 ");
//        return strings;
//    }

    //or perhaps it was meant to be like this:
    public static String printArray(int[] array) {
        return Arrays.toString(array);
    }
}
