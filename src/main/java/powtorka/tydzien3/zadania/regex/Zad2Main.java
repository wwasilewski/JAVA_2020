package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a string to check if it is a correct PL postal code: ");
        String stringToCheck = sc.nextLine();

        Zad2 zad2 = new Zad2();
        Boolean isPostalCode = zad2.checkIfPostal(stringToCheck);
        if (isPostalCode) {
            System.out.println("this is a correct PL postal code");
        } else {
            System.out.println("this is not a correct PL postal code");
        }
        sc.close();
    }
}
