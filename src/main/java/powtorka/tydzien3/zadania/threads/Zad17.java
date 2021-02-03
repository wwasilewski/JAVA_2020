/*
Wykorzystaj pulę wątków (5 wątków). Niech każdy z wątków po uruchochomieniu
losuje czas uśpienia z zakresu 1-5 sekund u usypia się. Po wybudzeniu każdy wątek
powinien wyświetlić losową godzinę w postaci 12h13m14s34ms
*/

package powtorka.tydzien3.zadania.threads;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Zad17 implements Runnable {
    private final Random random = new Random();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH'h'mm'm'ss's'SS'ms'");

    @Override
    public void run() {
        try {
            Thread.sleep(random.nextInt(4001) + 1000);
            System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now().format(formatter));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
