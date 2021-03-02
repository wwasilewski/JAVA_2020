package powtorka.tydzien5.programowanie1.ex008.ex4;

import powtorka.Utils;

public class Main {
    public static void main(String[] args) {
        String plateToCheck = Utils.displayTextAndGetValue("provide plate number to check: ", true);
        PlateValidator plateValidator = new PlateValidator();
        boolean plate = plateValidator.validate(plateToCheck);

        if (plate) {
            System.out.println("plate valid");
        } else {
            System.out.println("plate invalid");
        }
    }
}
