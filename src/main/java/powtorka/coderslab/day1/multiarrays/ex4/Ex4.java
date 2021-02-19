/*
1. Wypisz na konsoli ślad macierzy
(sumę elementów na głównej przekątnej) przekazanej.
http://www.naukowiec.org/wiedza/matematyka/slad-macierzy_614.html
*/

package powtorka.coderslab.day1.multiarrays.ex4;

public class Ex4 {
    public static void main(String[] args) {
        int[][] task4Array = {{2, 3, 4, 6},
                {12, 32, 12, 11},
                {3, 2, 1, 4},
                {5, 1, 6, 7}};

        int sum = 0;
        for (int i = 0; i < task4Array.length; i++) {
            for (int j = 0; j < task4Array[i].length; j++) {
                if (i == j) {
                    sum += task4Array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
