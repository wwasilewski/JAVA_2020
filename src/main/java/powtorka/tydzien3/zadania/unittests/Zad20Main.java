package powtorka.tydzien3.zadania.unittests;

import java.util.Scanner;

public class Zad20Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide a name: ");
        String name = sc.nextLine();

        Zad20 zad20 = new Zad20();
        System.out.println("number of vowels: " + zad20.countVowels(name) +
                ", consonants: " + zad20.countConsonants(name));
        sc.close();
    }
}
