/*
static int[] append(int[] arr)
1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana
do tymczasowej tablicy, której rozmiar ma być 2-krotnie większy od tablicy podanej.
2. Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w
odwrotnej kolejności.
3. Metoda ma zwrócić skopiowaną i uzupełnioną tablicę.
Przykład: dla tablicy int arr[] = {1,2,3}; ma zwrocic tablice int arrTmp[] = {1,2,3,3,2,1};
*/

package powtorka.coderslab.day1.homework.ex5;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        System.out.println(Arrays.toString(append(myArray)));
    }

    public static int[] append(int[] arr) {
        int[] result;
        result = Arrays.copyOf(arr, (arr.length) * 2);
        for (int i = arr.length; i < result.length; i++) {
            result[i] = arr[result.length - 1 - i];
        }
        return result;
    }
}
