/*
Wykorzystując klasę Stream wygeneruj 10 losowych liczb z zakresu <0,100),
następnie wymnóż każdą wylosowaną liczbę za pomocą map przez 2 i korzystając z
forach wyświetl każdą wylosowany i wymnożoną liczbę.
*/

package powtorka.tydzien3.zadania.lambdastreams.zad31;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Zad31 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[10];

        IntStream.rangeClosed(0, 9).forEach(i -> numbers[i] = random.nextInt(100));
        Arrays.stream(numbers)
                .forEach(number -> System.out.print(number + " "));
        System.out.println();
        Arrays.stream(numbers)
                .map(number -> number * 2)
                .forEach(number -> System.out.print(number + " "));
    }
}
