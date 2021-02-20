/*
static int[] minimum(int[][] arr)
Uzupełnij ciało metody by dla otrzymanej tablicy 2-wymiarowej dla każdego jej wiersza
wyznaczyła minimalną wartość.
Poszczególne minimalne wartości mają być umieszczone w tablicy, którą metoda zwraca.
*/

package powtorka.coderslab.day1.homework.ex3;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[][] myArray = {{3, 4, 5}, {1, 2, 3}, {5, 6, 7}};
        int[] minimum = minimum(myArray);
        System.out.println(Arrays.toString(minimum));
    }

    public static int[] minimum(int[][] arr) {
        int min[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            min[i] = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (min[i] > arr[i][j]) {
                    min[i] = arr[i][j];
                }
            }
        }
        return min;
    }
}
