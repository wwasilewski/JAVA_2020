//Zmodyfikuj program z zadania #3 tak aby wypisywał wyniki od 0 do 10 co 0.5

package powtorka.tydzien1_zadania.domowe;

public class Zadanie6 {

    static double funkcja(double x) {
        return x * x + 3;
    }

    static void wypisz(double x, double y) {
        System.out.println("dla x = " + x + " y = " + y);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            wypisz(i / 2.0, funkcja(i / 2.0));
        }
    }
}
