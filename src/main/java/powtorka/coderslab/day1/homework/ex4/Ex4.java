/*
static int[] lessMore(int[][] arr)
Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej obliczyć średnią arytmetyczną.
Oblicz ile elementów jest mniejszych a ile większych od średniej.
Metoda ma zwrócić tablicę składającą się z 2
elementów 1 - ilość elementów mniejszych od średniej, 2- ilość elementów większych.
*/

package powtorka.coderslab.day1.homework.ex4;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[][] arr = {{2, 5, 4}, {1, 4, 6}, {2, 3}};
        System.out.println(Arrays.toString(lessMore(arr)));
    }

    public static int[] lessMore(int[][] arr) {
        int numberOfElementsFromArr = 0;
        float meanAverage;
        float sumOfNumbersFromArr = 0;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                sumOfNumbersFromArr += anInt;
                numberOfElementsFromArr++;
            }
        }
        meanAverage = sumOfNumbersFromArr / numberOfElementsFromArr;

        int[] result = new int[2]; //{less, greater}
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (meanAverage < anInt) {
                    result[1]++;
                } else if (meanAverage > anInt) {
                    result[0]++;
                }
            }
        }
        return result;
    }
}
