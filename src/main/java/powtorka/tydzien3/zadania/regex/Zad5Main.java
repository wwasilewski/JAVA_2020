package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a date in a format like this: \"10.02.2018r.\"");

        Zad5 zad5 = new Zad5();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (zad5.checkForValidDate(stringToCheck)) {
                System.out.println("date is valid");
                break;
            } else {
                System.out.println("date invalid, pick again");
            }
        }
        sc.close();
    }
}
