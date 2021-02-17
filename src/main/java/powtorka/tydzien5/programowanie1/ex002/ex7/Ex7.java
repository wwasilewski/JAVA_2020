/*
Napisz program, który oblicza osobno sumę liczb w tablicy na pozycjach parzystych
i nieparzystych, a następnie sprawdza która suma jest większa wyświetlając
stosowny komunikat. Przygotuj testy jednostkowe sprawdzające działanie metody.
*/

package powtorka.tydzien5.programowanie1.ex002.ex7;

public class Ex7 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 2, 2, 4, 2};
        System.out.println(checkSumOfOddAndEvenPositionInArray(myArray));
    }

    public static String checkSumOfOddAndEvenPositionInArray(int[] array) {
        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumOfEvenNumbers += array[i];
            } else {
                sumOfOddNumbers += array[i];
            }
        }
        if (sumOfOddNumbers > sumOfEvenNumbers) {
            return "sumOfNumbersAtOddPosition is greater";
        } else if (sumOfEvenNumbers > sumOfOddNumbers) {
            return "sumOfNumbersAtEvenPosition is greater";
        } else {
            return "sumOfNumbers is even";
        }
    }
}
