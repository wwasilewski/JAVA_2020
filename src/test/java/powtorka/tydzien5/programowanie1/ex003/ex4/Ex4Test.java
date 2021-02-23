package powtorka.tydzien5.programowanie1.ex003.ex4;

import org.junit.Assert;
import org.junit.Test;

public class Ex4Test {

    Ex4 ex4 = new Ex4();

    @Test
    public void removePolishSymbolsTest() {
        Assert.assertEquals("aaaccceee", ex4.removePolishSymbols("ąąąćććęęę"));
        Assert.assertEquals("AAANNNOOO", ex4.removePolishSymbols("ĄĄĄŃŃŃÓÓÓ"));
        Assert.assertEquals("AaCcNnEe", ex4.removePolishSymbols("ĄąĆćŃńĘę"));
    }

    @Test
    public void removePolishSymbols2Test() {
        Assert.assertEquals("aaaccceee", ex4.removePolishSymbols("ąąąćććęęę"));
        Assert.assertEquals("AAANNNOOO", ex4.removePolishSymbols("ĄĄĄŃŃŃÓÓÓ"));
        Assert.assertEquals("AaCcNnEe", ex4.removePolishSymbols("ĄąĆćŃńĘę"));
    }
}