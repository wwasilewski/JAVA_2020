/*
Przygotuj aplikację uruchamiającą 1 wątek wyświetlający losową liczbę z zakresu
10-100. Wątek powinien wyświetlić liczbę 5 razy w odstępie 1 sekundy. Przygotuj
wątek poprzez implementację interfejsu Runnable.
*/

package powtorka.tydzien3.zadania.threads;

import java.util.Random;

public class Zad16 implements Runnable {
    private static final int TIMEOUT = 1000;
    private Random random = new Random();

    @Override
    public void run() {
        int counter = 0;
        try {
            while (counter < 5) {
                System.out.println(random.nextInt(91) + 10);
                counter++;
                Thread.sleep(TIMEOUT);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
