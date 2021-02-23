package powtorka.tydzien5.programowanie1.ex003.ex3;

import org.junit.Assert;
import org.junit.Test;

public class Ex3Test {

    Ex3 ex3 = new Ex3();

    @Test
    public void reverseStringTest() {
        Assert.assertEquals("dsa", ex3.reverseString("asd"));
        Assert.assertEquals("54321", ex3.reverseString("12345"));
        Assert.assertEquals("gnirts tset", ex3.reverseString("test string"));
    }
}
