package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad1BMain {
    public static void main(String[] args) {

        Zad1B zad1b = new Zad1B();
        System.out.println("provide string to check: ");

        Scanner sc = new Scanner(System.in);
        String strToCheck = sc.nextLine();

        if (zad1b.isValid(strToCheck)) {
            System.out.printf("number is %s even", zad1b.isOdd(strToCheck) ? "not" : "");
        } else {
            System.out.println("not a number");
        }
    }
}
