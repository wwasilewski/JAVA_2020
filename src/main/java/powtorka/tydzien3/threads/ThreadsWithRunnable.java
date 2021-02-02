package powtorka.tydzien3.threads;

public class ThreadsWithRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("test thread: " + Thread.currentThread().getName());
    }
}
