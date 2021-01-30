package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad7Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a string to check for serial license:");

        Zad7 zad7 = new Zad7();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (zad7.checkForSerialLicense(stringToCheck)) {
                System.out.println("it is a valid serial license");
                break;
            } else {
                System.out.println("serial license invalid, pick again: ");
            }
        }
    }
}
