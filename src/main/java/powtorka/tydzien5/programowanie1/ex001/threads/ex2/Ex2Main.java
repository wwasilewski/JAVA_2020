package powtorka.tydzien5.programowanie1.ex001.threads.ex2;

public class Ex2Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex2());
        Thread thread2 = new Thread(new Ex2());

        thread1.start();
        thread2.start();
    }
}
