package powtorka.tydzien5.programowanie1.ex003.ex1;

import powtorka.Utils;

public class Ex1Main {
    public static void main(String[] args) {
        String valueToCheck = Utils.displayTextAndGetValue("provide a number: ", true);
        Ex1 ex1 = new Ex1();
        Utils.displayTextOnConsole(ex1.oddOrEven(Integer.parseInt(valueToCheck)));
    }
}
