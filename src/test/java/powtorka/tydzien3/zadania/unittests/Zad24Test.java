package powtorka.tydzien3.zadania.unittests;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad24Test {

    @Test
    public void BMICalculatorTest() {
        float bmi = new Zad24().BMICalculator(86, 1.86f);
        Assert.assertThat(bmi, is(24.86f));
    }
}
