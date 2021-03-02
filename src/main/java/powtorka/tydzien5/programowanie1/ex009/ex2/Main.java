package powtorka.tydzien5.programowanie1.ex009.ex2;

import powtorka.Utils;

public class Main {
    public static void main(String[] args) {
        int numberToCheck = Utils.displayTextAndGetInt("provide a number: ");
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        System.out.println("nearest prime: " + findNearestPrime.findPrime(numberToCheck));
    }
}
