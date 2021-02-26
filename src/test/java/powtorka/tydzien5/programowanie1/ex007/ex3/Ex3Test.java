package powtorka.tydzien5.programowanie1.ex007.ex3;

import org.junit.Assert;
import org.junit.Test;

public class Ex3Test {

    @Test
    public void sumOfNumbersTest() {
        Assert.assertEquals(8, new Ex3().sumOfNumbers(2, 2, 2, 2));
        Assert.assertEquals(0, new Ex3().sumOfNumbers(2, -2, 2, -2));
        Assert.assertEquals(-3, new Ex3().sumOfNumbers(10, -2, -2, -9));
    }
}
