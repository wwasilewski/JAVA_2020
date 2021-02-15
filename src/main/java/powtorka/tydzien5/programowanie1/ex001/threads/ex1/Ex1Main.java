package powtorka.tydzien5.programowanie1.ex001.threads.ex1;

public class Ex1Main {
    public static void main(String[] args) {
        System.out.println("main thread: " + Thread.currentThread());
        Thread thread1 = new Thread(new Ex1());
        thread1.start();
    }
}
