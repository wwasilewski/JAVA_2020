/*
1. Dla znajdującej się w pliku zmiennej `str` pobierze przedostatnią literę.
2. Wyświetli na konsoli ilość jej wystąpień w naszym ciągu znaków.
*/

package powtorka.coderslab.day2.strings.ex1;

public class Ex1 {
    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";

        char penultimateChar = str.charAt(str.length() - 2);
        long numberOfOccurrences = str.chars().filter(c -> c == penultimateChar).count();
        System.out.println(numberOfOccurrences);
    }
}
