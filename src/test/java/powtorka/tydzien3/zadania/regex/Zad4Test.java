package powtorka.tydzien3.zadania.regex;

import org.junit.Assert;
import org.junit.Test;

public class Zad4Test {

    Zad4 zad4 = new Zad4();

    @Test
    public void checkStringForAla() {
        Assert.assertTrue(zad4.checkStringForAla("sasasaalaewew"));
        Assert.assertTrue(zad4.checkStringForAla("Alalala"));
        Assert.assertTrue(zad4.checkStringForAla("saasasasacwalasasa"));
    }

    @Test
    public void checkStringForNoAla() {
        Assert.assertFalse(zad4.checkStringForAla("nogooda lahere"));
        Assert.assertFalse(zad4.checkStringForAla("12121213e1212"));
        Assert.assertFalse(zad4.checkStringForAla("saasasaasallaaaaa"));
    }
}