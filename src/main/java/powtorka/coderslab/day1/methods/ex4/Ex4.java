/*
Napisz metodę `createName`, która przyjmie następujące parametry:
`name`: imię,
`surname`: nazwisko,
`nickname`: pseudonim.
Funkcja ma zwrócić łańcuch tekstowy z połączonymi parametrami w postaci Imię "Pseudonim" Nazwisko.
*/

package powtorka.coderslab.day1.methods.ex4;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(createName("Tom", "End", "The Beginning"));
    }

    public static String createName(String name, String surname, String nickname) {
        return name + " \"" + nickname + "\" " + surname;
    }
}
