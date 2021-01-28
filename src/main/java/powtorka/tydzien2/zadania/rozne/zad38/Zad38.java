/*
Napisz program obliczający pole powierzchni koła. Promień koła użytkownik
wprowadza z klawiatury. Program powinien zasygnalizować błędne dane (liczbę
ujemną lub zero) i ponownie zapytac o długośc promienia. Wykorzystaj metodę
Parse klasy float. Oczywiście nie zapomnij o przechwyceniu ewentualnych wyjątków.
*/

package powtorka.tydzien2.zadania.rozne.zad38;

import java.util.Scanner;

public class Zad38 {

    Scanner sc = new Scanner(System.in);

    public double circleArea(float radius) {
        return Math.PI * radius * radius;
    }

    public void printCircleArea() {
        System.out.println("pick circle's radius:");
        float radius;

        while (true) {
            try {
                radius = Float.parseFloat(sc.nextLine());
                if (radius > 0) {
                    System.out.println("circle'a area: " + circleArea(radius));
                    break;
                } else {
                    System.out.println("radius has to be > 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("wrong input data, pick again");
            }
        }
        sc.close();
    }
}
