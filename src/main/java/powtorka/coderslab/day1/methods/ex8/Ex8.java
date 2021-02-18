/*
Napisz metodę `maxOfThree`, która przyjmie trzy parametry liczbowe.
Funkcja ma zwrócić największą liczbę.
*/

package powtorka.coderslab.day1.methods.ex8;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println(maxOfThree(5, 3, 1));
    }

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num3, (Math.max(num1, num2)));
    }
}
