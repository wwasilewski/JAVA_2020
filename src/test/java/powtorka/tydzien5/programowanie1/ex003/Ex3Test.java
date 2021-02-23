package powtorka.tydzien5.programowanie1.ex003;

import org.junit.Assert;
import org.junit.Test;

public class Ex3Test {

    Ex3 ex3 = new Ex3();

    @Test
    public void oddOrEvenTest() {
        Assert.assertEquals("number is even", ex3.oddOrEven(2));
        Assert.assertEquals("number is even", ex3.oddOrEven(0));
        Assert.assertEquals("number is even", ex3.oddOrEven(-2));
        Assert.assertEquals("number is odd", ex3.oddOrEven(3));
        Assert.assertEquals("number is odd", ex3.oddOrEven(-3));
        Assert.assertEquals("number is odd", ex3.oddOrEven(213));
    }
}