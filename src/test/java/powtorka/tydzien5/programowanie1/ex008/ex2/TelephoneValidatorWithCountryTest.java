package powtorka.tydzien5.programowanie1.ex008.ex2;

import org.junit.Assert;
import org.junit.Test;

public class TelephoneValidatorWithCountryTest {

    TelephoneValidatorWithCountry tv = new TelephoneValidatorWithCountry();

    @Test
    public void validateTest() {
        Assert.assertTrue(tv.validate("123456789"));
        Assert.assertTrue(tv.validate("+12123456789"));
        Assert.assertTrue(tv.validate("123 456 789"));
        Assert.assertTrue(tv.validate("+32123 456 789"));
        Assert.assertTrue(tv.validate("123-456-789"));
        Assert.assertTrue(tv.validate("+23123-456-789"));

        Assert.assertFalse(tv.validate("1234567890"));
        Assert.assertFalse(tv.validate("-12123456789"));
        Assert.assertFalse(tv.validate("+111123456789"));
        Assert.assertFalse(tv.validate("+11112 345 678 9"));
        Assert.assertFalse(tv.validate("+11112-345-678-9"));
        Assert.assertFalse(tv.validate("+11112345"));
    }
}