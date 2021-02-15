/*
Utwórz aplikację wielowątkową. Skorzystaj ze stałej (5 sztuk) puli wątków. Niech
każdy wątek wyświetla kolejno liczby z przedziału 1-10. Każdy z wątków powinien
dodatkowo wyświetlać informację o rozpoczęciu przetwarzania i jego zakończeniu.
*/

package powtorka.tydzien5.programowanie1.ex001.threads.ex4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex4 extends Thread {
    public void createThreadsAndPrintNumbers(int howManyThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(howManyThreads);

        for (int i = 0; i < howManyThreads; i++) {
            executorService.execute(() -> {
                System.out.println("starting :" + Thread.currentThread());
                for (int j = 1; j < 11; j++) {
                    System.out.println(Thread.currentThread() + ": " + j);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("ending: " + Thread.currentThread());

            });
        }
        executorService.shutdown();
    }
}
