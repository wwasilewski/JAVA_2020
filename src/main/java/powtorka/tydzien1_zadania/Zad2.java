/*
2. Napisz program, który obliczy sumę liczb od 1 do 100 oraz obliczy średnią z tych liczb
*/

package powtorka.tydzien1_zadania;

public class Zad2 {
    public static void main(String[] args) {

        int wynik = 0;
        double licznik = 0;

        for (int i = 1; i < 101; i++) {
            wynik = wynik + i;
            licznik++;
        }
        System.out.println("suma liczb od 1-100 to: " + wynik);
        System.out.println("srednia z tych liczb to: " + wynik / licznik);
    }
}
