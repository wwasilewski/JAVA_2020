/*
Napisz program wyświetlający tablicę w formacie { x1, x2, x3, x4, x5, x6 }
Metoda wyświetlająca tablicę ma następującą sygnaturę
public void printArray(int[] array)
*/

package powtorka.tydzien5.programowanie1.ex002.ex1;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        printArray(myArray);
    }

//    public static void printArray(int[] array) {
//        System.out.print("{ ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("x" + array[i]);
//            if (i < array.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.print(" }");
//    }

    //or perhaps it was meant to be like this:
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
