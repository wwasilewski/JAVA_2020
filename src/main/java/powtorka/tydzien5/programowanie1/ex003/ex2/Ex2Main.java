package powtorka.tydzien5.programowanie1.ex003.ex2;

import powtorka.Utils;

public class Ex2Main {
    public static void main(String[] args) {
        String numberToCheck = Utils.displayTextAndGetValue("provide a number: ", true);
        Ex2 ex2 = new Ex2();
        ex2.printResults(Integer.parseInt(numberToCheck));
    }
}
