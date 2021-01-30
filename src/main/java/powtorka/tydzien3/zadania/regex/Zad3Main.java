package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pick a string to check if it is a valid login:");

        Zad3 zad3 = new Zad3();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (zad3.checkLogin(stringToCheck)) {
                System.out.println("it is a valid login");
                break;
            } else {
                System.out.println("it is not a valid login, pick again");
            }
        }
        sc.close();
    }
}
