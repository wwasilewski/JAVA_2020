/*
Przygotuj aplikację składającą się z 2 wątków Utwórz każdy wątek samodzielnie.
Niech każdy wątek wyświetla liczby całkowite od 1-10.
Zmodyfikuj aplikację tak, aby wątek 2 rozpoczął przetwarzanie po zakończeniu
wyświetlania liczb przez wątek 1. Skorzystaj z operacji join().
*/

package powtorka.tydzien5.programowanie1.ex001.threads.ex3;

public class Ex3 implements Runnable {
    @Override
    public void run() {
        int counter = 1;
        while (counter < 11) {
            System.out.println(Thread.currentThread() + " - " + counter);
            counter++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
