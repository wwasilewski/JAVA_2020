/*
static boolean divisibleBy(int a, int b )
Uzupełnij ciało metody tak aby zwracała `true` bądź `false` w zależności czy
zmienna `a` jest podzielna przez `b`.
*/

package powtorka.coderslab.day1.homework.ex2;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(divisibleBy(6, 2));
    }

    public static boolean divisibleBy(int a, int b) {
        return a % b == 0;
    }
}
