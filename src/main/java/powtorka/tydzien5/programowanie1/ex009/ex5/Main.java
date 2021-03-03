package powtorka.tydzien5.programowanie1.ex009.ex5;

import powtorka.Utils;

public class Main {
    public static void main(String[] args) {
        String equation = Utils.displayTextAndGetValue("provide equation: ", true);
        Converter converter = new Converter();
        System.out.println(converter.convertStringToNumbers(equation));
    }
}
