package powtorka.tydzien5.programowanie1.ex008.ex1;

import powtorka.Utils;

public class Main {
    public static void main(String[] args) {
        String numberToCheck = Utils.displayTextAndGetValue("provide phone number to check: ", true);
        TelephoneValidator validator = new TelephoneValidator();
        boolean number = validator.validate(numberToCheck);

        if (number) {
            System.out.println("number is valid");
        } else {
            System.out.println("number invalid");
        }
    }
}
