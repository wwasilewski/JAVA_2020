/*
2. Napisz program, który obliczy sumę liczb od 1 do 100 oraz obliczy średnią z tych liczb
3. (*) Wykonaj zadanie 2 z użyciem pętli while-do oraz do-while
*/

package powtorka.tydzien1_zadania;

public class Zad3 {
    public static void main(String[] args) {

        System.out.println("suma liczb 1-100 petla while: ");
        int licznik = 0;
        int wynik = 0;

        while (licznik < 101) {
            wynik = wynik + licznik;
            licznik++;
        }
        System.out.println(wynik);
        System.out.println("srednia z tych liczb: " + wynik / 100d);

        System.out.println("suma liczb 1-100 petla do-while: ");
        licznik = 0;
        wynik = 0;

        do {
            wynik = wynik + licznik;
            licznik++;
        } while (licznik < 101);
        System.out.println(wynik);
        System.out.println("srednia z tych liczb: " + wynik / 100d);
    }
}
