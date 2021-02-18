/*
Napisz metodę `convertToUsd`, która przyjmuje parametr `zlotys`, czyli kwotę w złotówkach.
Funkcja ma zwrócić podaną kwotę w dolarach amerykańskich.
Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.
*/

package powtorka.coderslab.day1.methods.ex3;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(String.format("%.2f", convertToUsd(202)));
    }

    public static float convertToUsd(int zlotys) {
        return zlotys / 4.04f;
    }
}
