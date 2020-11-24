package powtorka.rekursja;

import java.util.Scanner;

public class SilniaRekursjaMain {
    public static void main(String[] args) {

        System.out.println("podaj liczbe calkowita dla ktorej chcesz policzyc silnie: ");
        Scanner sc = new Scanner(System.in);

        SilniaRekursja silniaRekursja = new SilniaRekursja();

        int liczba = sc.nextInt();

        System.out.println("silnia dla " + liczba + " to: " + silniaRekursja.silnia_rekursja(liczba));

        sc.close();
    }
}
