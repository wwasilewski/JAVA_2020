package powtorka.tydzien5.programowanie1.ex007.ex1;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println(tc.convertCelsiusToFahrenheit(32));
        System.out.println(tc.convertFahrenheitToCelsius(132));
    }
}
