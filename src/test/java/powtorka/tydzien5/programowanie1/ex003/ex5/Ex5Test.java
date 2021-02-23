package powtorka.tydzien5.programowanie1.ex003.ex5;

import org.junit.Assert;
import org.junit.Test;

public class Ex5Test {

    Ex5 ex5 = new Ex5();

    @Test
    public void checkIfPalindromeTest() {
        Assert.assertTrue(ex5.checkIfPalindrome("12321"));
        Assert.assertTrue(ex5.checkIfPalindrome("abbba"));
        Assert.assertTrue(ex5.checkIfPalindrome("0011aa1100"));
        Assert.assertFalse(ex5.checkIfPalindrome("sasasawqw"));
        Assert.assertFalse(ex5.checkIfPalindrome("1223454321"));
        Assert.assertFalse(ex5.checkIfPalindrome("sasas1"));
    }
}
