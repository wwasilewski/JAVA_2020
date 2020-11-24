//Napisz program, który wyświetli wszystkie liczby parzyste od 1 do 20 oraz liczby podzielne przez 3

package powtorka.tydzien1_zadania;

public class Parzyste {
    public static void main(String[] args) {

        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0) {
                System.out.println("liczba " + i + " podzielna przez 3");
            }
            if (i % 2 == 0) {
                System.out.println("liczba " + i + " parzysta");
            } else {
                System.out.println("liczba " + i + " nieparzysta");
            }
        }
    }
}
