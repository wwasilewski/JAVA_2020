package powtorka.rekursja;

public class SilniaRekursja {

    public int silnia_rekursja(int a) {
        if (a < 1) {
            return 1;
        } else
            return a * silnia_rekursja(a - 1);
    }
}
