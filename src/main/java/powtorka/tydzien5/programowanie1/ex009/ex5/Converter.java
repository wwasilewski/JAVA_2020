package powtorka.tydzien5.programowanie1.ex009.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {
    private List<String> numbersFromString;

    public Converter() {
        this.numbersFromString = new ArrayList<>();
    }

    public double convertStringToNumbers(String input) {
        Calculator calculator = new Calculator();
        double result = 0;

        if (input.contains("+")) {
            numbersFromString = Arrays.asList(input.split("\\+"));
            result = calculator.sum(Integer.parseInt(numbersFromString.get(0)),
                    Integer.parseInt(numbersFromString.get(1)));
        } else if (input.contains("-")) {
            numbersFromString = Arrays.asList(input.split("-"));
            result = calculator.subtract(Integer.parseInt(numbersFromString.get(0)),
                    Integer.parseInt(numbersFromString.get(1)));
        } else if (input.contains("*")) {
            numbersFromString = Arrays.asList(input.split("\\*"));
            result = calculator.multiply(Integer.parseInt(numbersFromString.get(0)),
                    Integer.parseInt(numbersFromString.get(1)));
        } else if (input.contains("/")) {
            numbersFromString = Arrays.asList(input.split("/"));
            result = calculator.divide(Integer.parseInt(numbersFromString.get(0)),
                    Integer.parseInt(numbersFromString.get(1)));
        } else if (input.contains("^")) {
            numbersFromString = Arrays.asList(input.split("\\^"));
            result = calculator.exponent(Double.parseDouble(numbersFromString.get(0)),
                    Double.parseDouble(numbersFromString.get(1)));
        }
        return result;
    }
}
