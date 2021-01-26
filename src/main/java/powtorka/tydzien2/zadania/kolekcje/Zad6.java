/*
Utwórz kolejkę Queue korzystając z implementacji PriorityQueue.
a. Pobierz od użytkownika ilość liczb jakie mają zostać wylosowane
b. Wylosuj wskazaną przez użytkownika ilość liczb korzystając z klasy Random
z zakresu <1,100> i dodaj je do kolejki.
c. Wyświetl kolejno liczby występujące w kolejce.
*/

package powtorka.tydzien2.zadania.kolekcje;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Zad6 {

    Queue<Integer> numbers = new PriorityQueue<>();
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public void drawNumbers() {
        System.out.println("how many numbers to draw?");
        int howManyNumbers = sc.nextInt();

        for (int i = 0; i < howManyNumbers; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }
        sc.close();
    }

    public void printNumbers() {
        System.out.println("drawn numbers:" + numbers);
    }
}
