package powtorka.tydzien3.zadania.regex;

import java.util.Scanner;

public class Zad1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a string to check if it is an integer: ");
        String pickedString = sc.nextLine();

        Zad1 zad1 = new Zad1();
        Boolean isInteger = zad1.checkIfNumber(pickedString);
        System.out.println("is it an integer? " + isInteger);
        try {
            int stringToInt = Integer.parseInt(pickedString);
            if (0 == stringToInt % 2) {
                System.out.println("picked number is even");
            } else {
                System.out.println("picked number is odd");
            }
        } catch (NumberFormatException e) {
            System.out.println("picked string is not an integer!");
        }
        sc.close();
    }
}
