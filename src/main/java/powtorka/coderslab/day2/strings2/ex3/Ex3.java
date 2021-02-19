/*
Metodę o sygnaturze `static int countTokens(String str)`.
1. Uzupełnij ciało metody tak, aby zwracała ilość elementów w ciągu znaków.
2. Metoda powinna pomijać białe znaki.

*/

package powtorka.coderslab.day2.strings2.ex3;

public class Ex3 {
    public static void main(String[] args) {
        String str = "This is my string to count";
        System.out.println(countTokens(str));
    }

    public static int countTokens(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                sum++;
            }
        }
        return sum;
    }
}
