/*
1. W pętli wypisz zawartość pierwszego wymiaru naszej tablicy.
2. W pętli wypisz długość tablic składających się na 2gi wymiar.
3. W pętli wypisz wszystkie elementy tablicy 2 wymiarowej
(musisz użyć do tego zagnieżdżonej pętli **for**).
*/

package powtorka.coderslab.day1.multiarrays.ex2;

public class Ex2 {
    public static void main(String[] args) {
        int[][] task2Array = {{2, 3, 4},
                {12, 32, 12, 11},
                {3, 2, 1, 4, 5},
                {5, 1, 6, 7, 8}};

        for (int i = 0; i < task2Array[0].length; i++) {
            System.out.println(task2Array[0][i]);
        }

        for (int[] ints : task2Array) {
            System.out.println(ints.length);
        }

        for (int[] ints : task2Array) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
