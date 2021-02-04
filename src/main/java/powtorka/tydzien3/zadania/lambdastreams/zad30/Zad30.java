/*
Za pomocą strumieni i klasy IntStream wygeneruj liczby losowania lotto.
*/

package powtorka.tydzien3.zadania.lambdastreams.zad30;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class Zad30 {

    private static Random random = new Random();

    public static void main(String[] args) {
        Set<Integer> lottoNumbers = new HashSet<>();
        IntStream.rangeClosed(0, 5).forEach(i -> {
            do {
            } while (!lottoNumbers.add(random.nextInt(49) + 1));
        });
        lottoNumbers.forEach(System.out::println);
    }
}
