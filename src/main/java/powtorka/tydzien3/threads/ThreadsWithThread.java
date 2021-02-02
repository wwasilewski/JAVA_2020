package powtorka.tydzien3.threads;

public class ThreadsWithThread extends Thread {
    private int counter = 0;

    @Override
    public void run() {
        try {
            while (counter < 5) {
                System.out.println("hello from thread: " + Thread.currentThread());
                counter++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
