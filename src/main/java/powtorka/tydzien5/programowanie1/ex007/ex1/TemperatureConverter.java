/*
Napisz program konwertujący temperaturę o C<=>F. Przygotuj klasę konwertującą
temperaturę i wykorzystaj ją w Main. Przygotuj testy jednostkowe sprawdzające
konwersję temperatury na F i na C.
*/

package powtorka.tydzien5.programowanie1.ex007.ex1;

public class TemperatureConverter {

    public double convertCelsiusToFahrenheit(double celsius) {
        return 1.8 * celsius + 32;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
