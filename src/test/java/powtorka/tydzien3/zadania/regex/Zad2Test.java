package powtorka.tydzien3.zadania.regex;

import org.junit.Assert;
import org.junit.Test;

public class Zad2Test {

    Zad2 zad2 = new Zad2();

    @Test
    public void checkIfPostalCodeValid() {
        Assert.assertTrue(zad2.checkIfPostal("70-422"));
        Assert.assertTrue(zad2.checkIfPostal("99-999"));
        Assert.assertTrue(zad2.checkIfPostal("00-000"));
    }

    @Test
    public void checkIfPostalInvalid() {
        Assert.assertFalse(zad2.checkIfPostal("70000"));
        Assert.assertFalse(zad2.checkIfPostal("70-2221"));
        Assert.assertFalse(zad2.checkIfPostal("70-22d"));
    }
}
