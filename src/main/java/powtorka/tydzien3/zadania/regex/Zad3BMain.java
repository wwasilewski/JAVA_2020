package powtorka.tydzien3.zadania.regex;

import powtorka.Utils;

public class Zad3BMain {
    public static void main(String[] args) {

        while (true) {
            String strToCheck = Utils.displayTextAndGetValue("provide login to check: ", true);
            if (new Zad3B().isValid(strToCheck)) {
                System.out.println("login ok");
                break;
            } else {
                System.out.println("login invalid");
            }
        }
    }
}
