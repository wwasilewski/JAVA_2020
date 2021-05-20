package powtorka.tydzien2.zadania.rozne.zad40;

import java.util.Scanner;

public class Zad40Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("provide a: ");
        while (true) {
            try {
                a = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("wrong input, again: ");
            }
        }

        System.out.println("provide b: ");
        while (true) {
            try {
                b = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("wrong input, again: ");
            }
        }

        System.out.println("provide c: ");
        while (true) {
            try {
                c = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("wrong input, again: ");
            }
        }

        Zad40 zad40 = new Zad40(new Solution());
        zad40.calculate(a, b, c);
    }
}
