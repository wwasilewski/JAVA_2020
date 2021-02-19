/*
Napisz program, który:
1. Dla znajdującej się w pliku zmiennej `str` podzieli napis na wyrazy.
2. Wyświetli na konsoli każdy w oddzielnej lini.
*/

package powtorka.coderslab.day2.strings2.ex1;

public class Ex1 {
    public static void main(String[] args) {
        String str = "This is my string to split.";
        String[] stringParts = str.split(" ");
        for (String s : stringParts)
            System.out.println(s);
    }
}
