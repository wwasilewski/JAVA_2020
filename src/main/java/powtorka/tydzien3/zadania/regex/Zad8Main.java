package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad8Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick invoice number to check:");

        Zad8 zad8 = new Zad8();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (zad8.checkInvoiceNumber(stringToCheck)) {
                System.out.println("invoice number is valid");
                break;
            } else {
                System.out.println("invoice number invalid, pick again:");
            }
        }
        sc.close();
    }
}
