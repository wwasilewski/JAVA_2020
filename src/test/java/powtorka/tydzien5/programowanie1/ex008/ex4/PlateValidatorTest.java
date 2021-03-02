package powtorka.tydzien5.programowanie1.ex008.ex4;

import org.junit.Assert;
import org.junit.Test;

public class PlateValidatorTest {

    PlateValidator plateValidator = new PlateValidator();

    @Test
    public void validate() {
        Assert.assertTrue(plateValidator.validate("CB3456J"));
        Assert.assertTrue(plateValidator.validate("CB34212"));
        Assert.assertTrue(plateValidator.validate("WY640WI"));

        Assert.assertFalse(plateValidator.validate("CBS3456"));
        Assert.assertFalse(plateValidator.validate("W1234YU"));
        Assert.assertFalse(plateValidator.validate("CC14WYG"));
    }
}
