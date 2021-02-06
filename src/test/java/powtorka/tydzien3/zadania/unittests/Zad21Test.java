package powtorka.tydzien3.zadania.unittests;

import org.junit.Assert;
import org.junit.Test;
import powtorka.tydzien3.zadania.unittests.zad21.Zad21;

import static org.hamcrest.core.Is.is;

public class Zad21Test {

    Zad21 zad21 = new Zad21();

    @Test
    public void sum() {
        double result = zad21.sum(21, 21);
        Assert.assertThat(result, is(42d));
    }

    @Test
    public void subtract() {
        double result = zad21.subtract(10, 4);
        Assert.assertThat(result, is(6d));
    }

    @Test
    public void multiply() {
        double result = zad21.multiply(4, 2);
        Assert.assertThat(result, is(8d));
    }

    @Test
    public void divide() throws Exception {
        Assert.assertThat(zad21.divide(4, 4), is(1d));
    }
}