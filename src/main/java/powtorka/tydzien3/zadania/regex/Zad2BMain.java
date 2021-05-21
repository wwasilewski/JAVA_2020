package powtorka.tydzien3.zadania.regex;

import powtorka.Utils;

public class Zad2BMain {
    public static void main(String[] args) {

        Zad2B zad2B = new Zad2B();
        String strToCheck = Utils.displayTextAndGetValue("provide postal code to check: ", true);
        if (zad2B.isPostalCode(strToCheck)) {
            System.out.println("postal code ok");
        } else {
            System.out.println("not a postal code");
        }
    }
}
