package powtorka.tydzien5.programowanie1.ex008.ex3;

import org.junit.Assert;
import org.junit.Test;

public class NameValidatorTest {

    NameValidator nameValidator = new NameValidator();

    @Test
    public void validateTest() {
        Assert.assertTrue(nameValidator.validate("Arek"));
        Assert.assertTrue(nameValidator.validate("Marek"));
        Assert.assertTrue(nameValidator.validate("Darek"));
        Assert.assertTrue(nameValidator.validate("Jarek"));

        Assert.assertFalse(nameValidator.validate("arek"));
        Assert.assertFalse(nameValidator.validate("aRek"));
        Assert.assertFalse(nameValidator.validate("AreK"));
        Assert.assertFalse(nameValidator.validate("Arek1"));
        Assert.assertFalse(nameValidator.validate("ARek"));
        Assert.assertFalse(nameValidator.validate("Ar€K"));
    }
}
