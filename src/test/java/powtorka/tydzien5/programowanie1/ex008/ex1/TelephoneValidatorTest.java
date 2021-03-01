package powtorka.tydzien5.programowanie1.ex008.ex1;

import org.junit.Assert;
import org.junit.Test;

public class TelephoneValidatorTest {

    TelephoneValidator tv = new TelephoneValidator();

    @Test
    public void validateTest() {
        Assert.assertTrue(tv.validate("123456789"));
        Assert.assertTrue(tv.validate("123-456-789"));
        Assert.assertTrue(tv.validate("123 456 789"));
        Assert.assertFalse(tv.validate("12345678"));
        Assert.assertFalse(tv.validate("123-456-78"));
        Assert.assertFalse(tv.validate("123 456 78"));
    }
}
