package powtorka.tydzien5.programowanie1.ex003.ex1;

import org.junit.Assert;
import org.junit.Test;

public class Ex1Test {

    Ex1 ex1 = new Ex1();

    @Test
    public void oddOrEvenTest() {
        Assert.assertEquals("number is even", ex1.oddOrEven(2));
        Assert.assertEquals("number is even", ex1.oddOrEven(0));
        Assert.assertEquals("number is even", ex1.oddOrEven(-2));
        Assert.assertEquals("number is odd", ex1.oddOrEven(3));
        Assert.assertEquals("number is odd", ex1.oddOrEven(-3));
        Assert.assertEquals("number is odd", ex1.oddOrEven(213));
    }
}
