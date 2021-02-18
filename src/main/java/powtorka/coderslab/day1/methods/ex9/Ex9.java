/*
Napisz metodę `factorial`, która przyjmie jako parametr liczbę naturalną `n`.
Funkcja ma zwrócić wartość *n!*,
czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1..n .
*/

package powtorka.coderslab.day1.methods.ex9;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
