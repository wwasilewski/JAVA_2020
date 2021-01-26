/*
Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
b. Wyświetl długość tablicy
c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
    zapisz go ponownie w tablicy.
e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
*/

package powtorka.tydzien2.zadania.kolekcje;

public class Zad1 {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        System.out.println("array's length: " + myArray.length);

        for (int j : myArray) {
            System.out.println(j);
        }

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (i + 1) * 2;
        }

        for (int j : myArray) {
            System.out.println(j);
        }
    }
}
