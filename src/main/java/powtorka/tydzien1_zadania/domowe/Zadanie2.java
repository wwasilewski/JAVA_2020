/*
Utwórz klasę Zadanie2. W tej klasie:
        - utwórz zmienną static int nrLini
        - utwórz zmienną tablicową z nazwami tygodnia
        - utwórz metodę która będzie wypisywać na konsole kolejny nr lini oraz tekst (w jednej linii)
        * nagłówek metody powinien być taki: static void wypisz (String tekst){...}
        - utwórz metodę public static void main która w pętli wypisze wszystkie dni tygodnia używając wcześniej utworzonej metody wypisz()
        - uruchom program i sprawdź wynik działania,
        program powinien wypisać coś takiego:
        1: niedziela
        2: poniedziałek
        3: wtorek
        itd.
*/

package powtorka.tydzien1_zadania.domowe;

public class Zadanie2 {

    static int nrlinii = 1;

    static void wypisz(String tekst) {

        System.out.println(nrlinii + ": " + tekst);
        nrlinii++;

    }

    public static void main(String[] args) {

        String dni[] = {"Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela"};

        for (int i = 0; i < dni.length; i++) {
            wypisz(dni[i]);
        }
    }
}
