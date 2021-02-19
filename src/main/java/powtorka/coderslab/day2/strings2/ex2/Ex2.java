/*
Napisz program, który:
Dla znajdującej się w pliku zmiennej `str` podzieli napis na zdania. Znakiem podziału jest kropka (.)
Wyświetli na konsoli każde zdanie w oddzielnej lini.
*/

package powtorka.coderslab.day2.strings2.ex2;

import java.util.StringTokenizer;

public class Ex2 {
    public static void main(String[] args) {
        String str = "Z Coders Lab niezależnie od wykształcenia możesz zmienić swoją karierę." +
                " Jesteśmy szkołą oferującą bardzo intensywne kursy programowania." +
                " Przygotujemy Cię do pracy na stanowisku junior web developera" +
                " i pomożemy znaleźć zatrudnienie po kursie.";

        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken(".") + ".");
        }
    }
}
