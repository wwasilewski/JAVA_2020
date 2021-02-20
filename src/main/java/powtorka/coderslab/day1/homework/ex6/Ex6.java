/*
static int evenSum(int[][] arr)
Uzupełnij ciało metody tak, aby zliczyła sumę wartości dla wszystkich elementów
z nieparzystych indeksów.
Metoda ma zwrócić sumę. Przykład: dla tablicy int arr[][] = {{1,2,3},{4,5,6}}; int sum = 2 + 5;
*/

package powtorka.coderslab.day1.homework.ex6;

public class Ex6 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3, 4, 4}};
        System.out.println(evenSum(arr));
    }

    public static int evenSum(int[][] arr) {
        int sumOfAllOddPositions = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                if (j % 2 != 0) {
                    sumOfAllOddPositions += ints[j];
                }
            }
        }
        return sumOfAllOddPositions;
    }
}
