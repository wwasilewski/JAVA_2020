/*
Napisz program, który po wpisaniu dowolnej liczby całkowitej (int) poda najbliższą
liczbę pierwszą. W przypadku pojawienia się dwóch o tej samej bliskości, wybierze
większą. np. 6 -> 7, a nie 5.
*/

package powtorka.tydzien5.programowanie1.ex009.ex2;

public class PrimeChecker {

    public boolean isPrime(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
