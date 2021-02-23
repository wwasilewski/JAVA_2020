package powtorka.tydzien5.programowanie1.ex003.ex4;

import powtorka.Utils;

public class Ex4Main {
    public static void main(String[] args) {
        String strToChange = Utils.displayTextAndGetValue("provide polish symbols: ", true);
        Ex4 ex4 = new Ex4();
        Utils.displayTextOnConsole(ex4.removePolishSymbols(strToChange));
        Utils.displayTextOnConsole(ex4.removePolishSymbols2(strToChange));
    }
}
