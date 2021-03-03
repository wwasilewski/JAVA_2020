package powtorka.tydzien5.programowanie1.ex009.ex5;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void sumTest() {
        Assert.assertEquals(5, calculator.sum(3, 2));
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(12, calculator.multiply(4, 3));
    }

    @Test
    public void divideTest() {
        Assert.assertEquals(3, calculator.divide(12, 4), 0.1);
    }

    @Test
    public void exponentTest() {
        Assert.assertEquals(8, calculator.exponent(2, 3), 0.1);
    }
}
