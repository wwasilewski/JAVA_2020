package powtorka.rekursja;

public class Rekursja {
    public static void main(String[] args) {

        int wynik = rekursja_suma(3);
        System.out.println(wynik);
    }

    public static int rekursja_suma(int a) {
        if (a > 0) {
            return a + rekursja_suma(a - 1);
        } else {
            return 0;
        }
    }
}
