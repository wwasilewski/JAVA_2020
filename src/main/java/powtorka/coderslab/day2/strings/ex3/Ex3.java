/*
1. Dla znajdującej się w pliku zmiennej `str` wyświetli na konsoli odwrócony napis.
Przykład: dla napisu `Tak` wyświetli `kaT`.
*/

package powtorka.coderslab.day2.strings.ex3;

public class Ex3 {
    public static void main(String[] args) {
        String str = "String to reverse";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
