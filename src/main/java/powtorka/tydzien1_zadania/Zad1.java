/*
1. Napisz program, który wylistuje imiona z tablicy
        • używając for
        • używając for-each
*/

package powtorka.tydzien1_zadania;

public class Zad1 {
    public static void main(String[] args) {

        System.out.println("petla for: ");
        String[] imiona = {"Kaska", "Maria", "Tomek", "Marek", "Wojtek", "Irek"};

        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
        }

        System.out.println("petla for-each: ");
        for (String i : imiona) {
            System.out.println(i);
        }
    }
}
