package powtorka.tydzien2.zadania.rozne.zad39;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zad39 zad39 = new Zad39();

        Scanner sc = new Scanner(System.in);
        System.out.println("pick a number, \"0\" ends it");
        float number;

        List<Float> listOfNumbers = new ArrayList<>();

        while (true) {
            try {
                number = Float.parseFloat(sc.nextLine());
                if (0 != number) {
                    listOfNumbers.add(number);
                    System.out.println("pick another number: ");
                } else {
                    System.out.println("time to print results: ");
                    zad39.print(listOfNumbers);
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("incorrect data, pick again");
            }
        }
        sc.close();
    }
}
