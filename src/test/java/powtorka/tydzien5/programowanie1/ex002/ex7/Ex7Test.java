package powtorka.tydzien5.programowanie1.ex002.ex7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Ex7Test {

    int[] myArray1 = {1, 3, 2, 2, 4, 2};
    int[] myArray2 = {5, 1, 2, 2, 4, 2};
    int[] myArray3 = {0, 3, 2, 2, 4, 2};

    @Test
    public void isSumOfEvenPositionInArrayOk() {
        assertEquals(7, Ex7.sumOfEvenPositionInArray(myArray1));
        assertEquals(11, Ex7.sumOfEvenPositionInArray(myArray2));
        assertEquals(6, Ex7.sumOfEvenPositionInArray(myArray3));
        assertNotEquals(2, Ex7.sumOfEvenPositionInArray(myArray1));
        assertNotEquals(3, Ex7.sumOfEvenPositionInArray(myArray2));
        assertNotEquals(0, Ex7.sumOfEvenPositionInArray(myArray3));
    }

    @Test
    public void isSumOfOddPositionInArrayOk() {
        assertEquals(7, Ex7.sumOfOddPositionInArray(myArray1));
        assertEquals(5, Ex7.sumOfOddPositionInArray(myArray2));
        assertEquals(7, Ex7.sumOfOddPositionInArray(myArray3));
        assertNotEquals(0, Ex7.sumOfOddPositionInArray(myArray1));
        assertNotEquals(-1, Ex7.sumOfOddPositionInArray(myArray2));
        assertNotEquals(111, Ex7.sumOfOddPositionInArray(myArray3));
    }

    @Test
    public void isPrintBiggerSumOk() {
        assertEquals("sumOfNumbers is even", Ex7.printBiggerSum(myArray1));
        assertEquals("sumOfNumbersAtEvenPosition is greater", Ex7.printBiggerSum(myArray2));
        assertEquals("sumOfNumbersAtOddPosition is greater", Ex7.printBiggerSum(myArray3));
    }
}
