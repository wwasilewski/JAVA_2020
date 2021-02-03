package powtorka.tydzien3.zadania.unittests;

import java.util.Scanner;

public class Zad24Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide your weight(kg): ");
        String weight = sc.nextLine();
        System.out.println("provide your height(m): ");
        String height = sc.nextLine();

        Zad24 zad24 = new Zad24();
        float bmi = zad24.BMICalculator(Float.parseFloat(weight), Float.parseFloat(height));
        System.out.println("your bmi: " + bmi);
    }
}
