package powtorka.tydzien5.programowanie1.ex003.ex5;

import powtorka.Utils;

public class Ex5Main {
    public static void main(String[] args) {
        String strToCheck = Utils.displayTextAndGetValue("provide string to check: ", true);
        Ex5 ex5 = new Ex5();
        ex5.printAll(strToCheck);
    }
}
