package powtorka.tydzien3.zadania.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zad17Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            es.execute(new Zad17());
        }
        es.shutdown();
    }
}
