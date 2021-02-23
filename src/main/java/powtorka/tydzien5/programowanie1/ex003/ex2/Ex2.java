/*
Napisz program, który pobiera liczbę od użytkownika i sprawdza czy wprowadzona
liczba jest liczbą pierwszą. Program wyświetla komunikat
“Podana liczba <liczba> jest liczbą pierwszą” lub
“Podana liczba <liczba> nie jest liczbą pierwszą”
*/

package powtorka.tydzien5.programowanie1.ex003.ex2;

public class Ex2 {

    public boolean findPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printResults(int number) {
        if (findPrimeNumber(number)) {
            System.out.println("number " + number + " is prime");
        } else {
            System.out.println("number " + number + " is not prime");
        }
    }
}
