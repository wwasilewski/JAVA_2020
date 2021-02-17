package powtorka.tydzien5.programowanie1.ex002.ex8;

import org.junit.Assert;
import org.junit.Test;

public class Ex8Test {

    @Test
    public void isCheckArrayOk() {
        Assert.assertEquals(true, Ex8.checkArray(new int[]{5, 4, 3, 2, 1}));
        Assert.assertEquals(true, Ex8.checkArray(new int[]{1, 2, 3, 2, 1}));
        Assert.assertEquals(true, Ex8.checkArray(new int[]{2, 2, 1, 0, 4}));
        Assert.assertEquals(false, Ex8.checkArray(new int[]{1, 2, 3, 3, 1}));
        Assert.assertEquals(false, Ex8.checkArray(new int[]{2, 1, 1, 1, 1}));
        Assert.assertEquals(false, Ex8.checkArray(new int[]{1, 2}));
    }
}