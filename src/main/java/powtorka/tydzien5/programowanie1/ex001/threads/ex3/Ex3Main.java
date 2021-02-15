package powtorka.tydzien5.programowanie1.ex001.threads.ex3;

public class Ex3Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex3());
        Thread thread2 = new Thread(new Ex3());

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
