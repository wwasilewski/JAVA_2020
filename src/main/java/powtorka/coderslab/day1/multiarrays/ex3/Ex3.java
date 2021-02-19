/*
1. Wypisz na konsoli sumę wszystkich elementów tablicy.
*/

package powtorka.coderslab.day1.multiarrays.ex3;

public class Ex3 {
    public static void main(String[] args) {
        int[][] task3Array = {{9, 4, 1, 6},
                {1, 4, 7, 1},
                {3, 2, 1, 5, 4},
                {8, 1, 4, 6, 12}};

        int sum = 0;
        for (int[] ints : task3Array) {
            for (int endInts : ints) {
                sum += endInts;
            }
        }
        System.out.println(sum);
    }
}
