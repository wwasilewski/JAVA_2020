/*
Napisz program, który oblicza osobno sumę liczb w tablicy na pozycjach parzystych
i nieparzystych, a następnie sprawdza która suma jest większa wyświetlając
stosowny komunikat. Przygotuj testy jednostkowe sprawdzające działanie metody.
*/

package powtorka.tydzien5.programowanie1.ex002.ex7;

public class Ex7 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 2, 2, 4, 2};
        printBiggerSum(myArray);
    }

    public static int sumOfEvenPositionInArray(int[] array) {
        int sumOfEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumOfEvenNumbers += array[i];
            }
        }
        return sumOfEvenNumbers;
    }

    public static int sumOfOddPositionInArray(int[] array) {
        int sumOfOddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sumOfOddNumbers = sumOfOddNumbers + array[i];
            }
        }
        return sumOfOddNumbers;
    }

    public static String printBiggerSum(int[] array) {
        if (sumOfEvenPositionInArray(array) > sumOfOddPositionInArray(array)) {
            return "sumOfNumbersAtEvenPosition is greater";
        } else if (sumOfEvenPositionInArray(array) < sumOfOddPositionInArray(array)) {
            return "sumOfNumbersAtOddPosition is greater";
        } else {
            return "sumOfNumbers is even";
        }
    }
}
