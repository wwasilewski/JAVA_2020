/*
Napisz program, który usuwa z tablicy wartości znajdujące się w drugiej tablicy.
Przykładowo tablica wejściowa wygląda następująco [1, 5, 19, 100, 999]. Tablica z
liczbami do usunięcia wygląda następująco [19, 100]. Tablica będąca wynikiem
działania algorytmu powinna wyglądać następująco [1, 5, 999]. Sygnatura metody
usuwającej elementy z tablicy wygląda następująco:
public int[] removeValues(int[] array1, int[] array2)
*/

package powtorka.tydzien5.programowanie1.ex002.ex9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex9 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 19, 100, 999};
        int[] array2 = {19, 100};
        System.out.println((Arrays.toString(removeValues(array1, array2))));
    }

    public static int[] removeValues(int[] array1, int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] == array2[i]) {
                    int temp = array2[i];
                    array1 = IntStream.of(array1).filter(e -> e != temp).toArray();
                }
            }
        }
        return array1;
    }
}
