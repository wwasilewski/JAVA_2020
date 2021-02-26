package powtorka.tydzien5.programowanie1.ex007.ex1;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {

    TemperatureConverter tc = new TemperatureConverter();

    @Test
    public void convertCelsiusToFahrenheitTest() {
        Assert.assertEquals(89.6d, tc.convertCelsiusToFahrenheit(32), 0.01);
        Assert.assertEquals(212d, tc.convertCelsiusToFahrenheit(100), 0.01);
        Assert.assertEquals(32, tc.convertCelsiusToFahrenheit(0), 0.01);
    }

    @Test
    public void convertFahrenheitToCelsiusTest() {
        Assert.assertEquals(0, tc.convertFahrenheitToCelsius(32), 0.01);
        Assert.assertEquals(37.77777, tc.convertFahrenheitToCelsius(100), 0.01);
        Assert.assertEquals(100, tc.convertFahrenheitToCelsius(212), 0.01);
    }
}
