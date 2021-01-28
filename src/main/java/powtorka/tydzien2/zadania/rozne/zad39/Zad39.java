/*
Napisz program, który pobiera od użytkownika serię liczb różnych od zera (Zero
kończy wprowadzanie danych). Po wprowadzeniu danych program oblicza sumę
liczb wprowadzonych przez użytkownika, najmniejszą oraz największą liczbę. Na
koniec działania wyświetla obliczone wartości. Oczywiście nie zapomnij o
przechwyceniu ewentualnych wyjątków.
*/

package powtorka.tydzien2.zadania.rozne.zad39;

import java.util.List;

public class Zad39 {

    public float sumOfNumbers(List<Float> number) {
        float sum = 0;
        for (float v : number) {
            sum += v;
        }
        return sum;
    }

    public float biggestNumber(List<Float> number) {
        float biggest = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) > biggest) {
                biggest = number.get(i);
            }
        }
        return biggest;
    }

    public float smallestNumber(List<Float> number) {
        float smallest = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) < smallest) {
                smallest = number.get(i);
            }
        }
        return smallest;
    }

    public void print(List<Float> liczba) {
        System.out.println("picked numbers: " + liczba.toString());
        System.out.println("sum: " + sumOfNumbers(liczba));
        System.out.println("biggest: " + biggestNumber(liczba));
        System.out.println("smallest: " + smallestNumber(liczba));
    }
}
