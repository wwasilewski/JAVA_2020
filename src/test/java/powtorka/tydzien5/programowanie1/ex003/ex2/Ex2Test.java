package powtorka.tydzien5.programowanie1.ex003.ex2;

import org.junit.Assert;
import org.junit.Test;

public class Ex2Test {

    Ex2 ex2 = new Ex2();

    @Test
    public void findPrimeNumberTest() {
        Assert.assertTrue(ex2.findPrimeNumber(3));
        Assert.assertTrue(ex2.findPrimeNumber(17));
        Assert.assertTrue(ex2.findPrimeNumber(19));
        Assert.assertFalse(ex2.findPrimeNumber(-2));
        Assert.assertFalse(ex2.findPrimeNumber(0));
        Assert.assertFalse(ex2.findPrimeNumber(1));
        Assert.assertFalse(ex2.findPrimeNumber(12));
    }
}
