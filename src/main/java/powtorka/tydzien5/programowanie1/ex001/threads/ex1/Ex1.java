/*
Przygotuj aplikację uruchamiającą jeden wątek. Niech wątek wyświetla informację
hello world.
*/

package powtorka.tydzien5.programowanie1.ex001.threads.ex1;

public class Ex1 implements Runnable {
    @Override
    public void run() {
        System.out.println("made thread: " + Thread.currentThread() + " - hello world");
    }
}
