package powtorka.tydzien5.programowanie1.ex003;

import powtorka.Utils;

public class Ex3Main {
    public static void main(String[] args) {
        String valueToCheck = Utils.displayTextAndGetValue("provide a number: ", true);
        Ex3 ex3 = new Ex3();
        Utils.displayTextOnConsole(ex3.oddOrEven(Integer.parseInt(valueToCheck)));
    }
}
