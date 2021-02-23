package powtorka.tydzien5.programowanie1.ex003.ex3;

import powtorka.Utils;

public class Ex3Main {
    public static void main(String[] args) {
        String stringToReverse = Utils.displayTextAndGetValue("provide a string", true);
        Ex3 ex3 = new Ex3();
        Utils.displayTextOnConsole(ex3.reverseString(stringToReverse));
    }
}
