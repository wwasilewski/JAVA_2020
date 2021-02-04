/*
Utwórz tablicę typu int[]. Wylosuj 20 wartości z przedziału <100,200> i wyświetl
tablicę. Wykorzystując stream posortuj tablicę z wygenerowanymi wartościami
rosnąco, a następnie wyświetl tablicę, *Posortuj tablicę malejąca, a następnie ją
wyświetl.
*/

package powtorka.tydzien3.zadania.lambdastreams.zad32;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class Zad32 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[20];

        IntStream.rangeClosed(0, 19).forEach(i -> numbers[i] = random.nextInt(101) + 100);
        Arrays.stream(numbers)
                .forEach(number -> System.out.print(number + " "));

        System.out.println();
        Arrays.stream(numbers)
                .sorted()
                .forEach(number -> System.out.print(number + " "));

        System.out.println();
        Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(number -> System.out.print(number + " "));
    }
}
