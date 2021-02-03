package powtorka.tydzien3.zadania.unittests;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Zad20Test {

    Zad20 zad20 = new Zad20();

    @Test
    public void countVowels() {
        int result = zad20.countVowels("Tomasz");
        int result2 = zad20.countVowels("Magdalena");

        Assert.assertThat(result, is(2));
        Assert.assertTrue("counting does not work correctly", 4 == result2);
    }

    @Test
    public void countConsonants() {
        String text = "This is test string";
        Assert.assertEquals(12, zad20.countConsonants(text));
        String text2 = "what is this";
        Assert.assertEquals(7, zad20.countConsonants(text2));
    }
}