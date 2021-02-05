package powtorka.tydzien3.zadania.optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.ExpectedException;

import java.util.Optional;

public class Zadanie25Test {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    Zadanie25 zadanie25;

    @Before
    public void beforAllTests() {
        if (zadanie25 == null) {
            zadanie25 = new Zadanie25();
        }
    }

    @Test
    public void checkIfNullUsingOptional() {
        Assert.assertFalse("Should return false on when null provided.", zadanie25.checkIfNull(null));
        Assert.assertTrue("Should return true when not null value provided.", zadanie25.checkIfNull("Name"));
        Assert.assertTrue("Should return true when not null value provided.", zadanie25.checkIfNull(11));
    }

    @Test
    public void shouldPrintValueIfNotNullOtherwiseNot() {
        // Should print value on console
        zadanie25.printValue("This text should be displayed");
        Assert.assertTrue("Should print message", systemOutRule.getLog().contains("This text should be displayed"));
        systemOutRule.clearLog();
        // Shouldn't print value on console
        zadanie25.printValue(null);
        Assert.assertTrue("Something is wrong. Should be empty but is not ;)", systemOutRule.getLog().isEmpty());
    }

    @Test
    public void shouldReturnDefaultValueIfNullOrElse() {
        Assert.assertTrue("Should return \"n/a\" value", zadanie25.checkValue(null).equals("n/a"));
        Assert.assertTrue("Should return \"Jan Kowalski\"", zadanie25.checkValue("Jan Kowalski").equals("Jan Kowalski"));
    }

    @Test
    public void shouldReturnDefaultValueIfNull() {
        Assert.assertTrue("Should return \"n/a\" value", zadanie25.checkValue(null).equals("n/a"));
        Assert.assertTrue("Should return \"Jan Kowalski\"", zadanie25.checkValue("Jan Kowalski").equals("Jan Kowalski"));
    }

    @Test
    public void shouldThrowExceptionWhenNullProvided() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Remember, please do not provide null value!");
        zadanie25.throwExceptionWhenNull(null);
    }

    @Test
    public void shouldNotThrowExceptionWhenValueProvided() {
        Assert.assertEquals("Should return \"Lukasz\" value.", "Lukasz", zadanie25.throwExceptionWhenNull("Lukasz"));
        Assert.assertTrue("Should return \"2018\" value.", zadanie25.<Long>throwExceptionWhenNull(2018L).equals(2018L));
    }

    @Test
    public void shouldReturnOptionalWithText() {
        Optional optional = zadanie25.returnOptional("text");
        Assert.assertEquals(true, optional.isPresent());
        Assert.assertEquals("text", optional.get());
    }

    @Test
    public void shouldReturnOptionalWithNumber() {
        Optional optional = zadanie25.returnOptional(158);
        Assert.assertTrue("Optional should contain value", optional.isPresent());
        Assert.assertEquals(158, optional.get());
    }

    @Test
    public void shouldReturnEmptyOptional() {
        thrown.expect(NullPointerException.class);
        Optional optional = zadanie25.returnOptional(null);
        Assert.assertFalse("Optional should not contain value", optional.isPresent());
    }

    @Test
    public void shouldReturnOptionalWithNotNullProvided() {
        Optional optional = zadanie25.returnOptionalIfNotEmpty(3.5);
        Assert.assertTrue("Optional should contain value", optional.isPresent());
        Assert.assertEquals(3.5, optional.get());
    }

    @Test
    public void shouldReturnEmptyOptionalIfNullProvided() {
        Optional optional = zadanie25.returnOptionalIfNotEmpty(null);
        Assert.assertFalse("Optional should not conain value", optional.isPresent());
    }

    @Test
    public void priceShouldMatchPriceRange() {
        Assert.assertTrue(zadanie25.checkIfCarMatchThePrice(new Car(4000.0), 3000.0, 5000.0));
        Assert.assertFalse(zadanie25.checkIfCarMatchThePrice(new Car(4000.0), 4000.0, 5000.0));
        Assert.assertFalse(zadanie25.checkIfCarMatchThePrice(new Car(4000.0), 3000.0, 4000.0));
    }
}
