package powtorka.tydzien5.programowanie1.ex008.ex3;

import powtorka.Utils;

public class Main {
    public static void main(String[] args) {
        String nameToCheck = Utils.displayTextAndGetValue("provide phone number to check: ", true);
        NameValidator nameValidator = new NameValidator();
        boolean name = nameValidator.validate(nameToCheck);

        if (name) {
            System.out.println("correct name");
        } else {
            System.out.println("name incorrect");
        }
    }
}
