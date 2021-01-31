package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad9Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a string to show statistics: ");

        Zad9 zad9 = new Zad9();
        zad9.print(sc.nextLine());
        sc.close();
    }
}
