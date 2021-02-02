package powtorka.tydzien3.threads;

public class ThreadsWithMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadsWithRunnable());
        thread.start();

        Thread thread2 = new ThreadsWithThread();
        thread2.start();
    }
}
