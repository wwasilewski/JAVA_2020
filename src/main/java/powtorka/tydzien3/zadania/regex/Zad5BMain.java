package powtorka.tydzien3.zadania.regex;

import powtorka.TextColor;
import powtorka.Utils;

public class Zad5BMain {
    public static void main(String[] args) {

        while (true) {
            String dateToCheck = Utils.displayTextAndGetValue("provide date \"10.02.2018r.\" format: ", false);
            if (new Zad5B().isValid(dateToCheck)) {
                Utils.displayTextOnConsole("date ok", TextColor.ANSI_BLUE);
                break;
            } else {
                Utils.displayTextOnConsole("date invalid", TextColor.ANSI_RED);
            }
        }
    }
}
