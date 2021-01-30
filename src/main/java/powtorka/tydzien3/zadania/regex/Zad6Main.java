package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad6Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a string to check for valid serial number:");

        Zad6 zad6 = new Zad6();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (zad6.checkForValidSerialNumber(stringToCheck)) {
                System.out.println("serial number is valid");
                break;
            } else {
                System.out.println("serial number invalid, pick again: ");
            }
        }
        sc.close();
    }
}
