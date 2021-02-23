/*
Napisz program, który pobiera liczbę od użytkownika i sprawdza czy podana liczba
jest parzysta lub nieparzysta i wyświetla stosowny komunikat.
*/

package powtorka.tydzien5.programowanie1.ex003;

public class Ex3 {

    public String oddOrEven(int number) {
        return number % 2 == 0 ? "number is even" : "number is odd";
    }
}
