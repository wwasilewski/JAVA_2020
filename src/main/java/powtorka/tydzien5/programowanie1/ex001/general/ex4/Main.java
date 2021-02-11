package powtorka.tydzien5.programowanie1.ex001.general.ex4;

import powtorka.TextColor;
import powtorka.Utils;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Rambo", "67110343123");
        Utils.displayTextOnConsole(TextColor.ANSI_PURPLE, person.toString());
    }
}
