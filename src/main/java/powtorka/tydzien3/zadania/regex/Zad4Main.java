package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a string to look for \"ala\"");

        Zad4 zad4 = new Zad4();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (zad4.checkStringForAla(stringToCheck)) {
                System.out.println("string contains \"ala\"");
                break;
            } else {
                System.out.println("string does not contain \"ala\", pick again: ");
            }
        }
        sc.close();

    }
}
