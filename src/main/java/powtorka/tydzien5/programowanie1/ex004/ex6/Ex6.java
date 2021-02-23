/*
Mając daną tablicę typu int[], przekonwertuj ją na strumień, posortuj rosnąco, a
następnie znajdź wartość średnią pięciu elementów większych od wartości średniej
wszystkich elementów przechowywanych w tablicy
*/

package powtorka.tydzien5.programowanie1.ex004.ex6;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};
        System.out.println(numberWanted(numbers));
    }

    public static double numberWanted(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(element -> element > Arrays.stream(numbers).average().getAsDouble())
                .sorted()
                .limit(5)
                .average()
                .getAsDouble();
    }
}
