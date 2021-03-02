package powtorka.tydzien5.programowanie1.ex009.ex1;

import powtorka.TextColor;
import powtorka.Utils;

public class Main {
    public static void main(String[] args) {
        String numberToConvert = Utils.displayTextAndGetValue("provide a number: ", false);
        NumberConverter nc = new NumberConverter();
        String convertedNumber = nc.convertToString(Integer.parseInt(numberToConvert));
        Utils.displayTextOnConsole(numberToConvert + " = " + convertedNumber, TextColor.ANSI_CYAN);
    }
}
