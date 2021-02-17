/*
Napisz program, który zwraca tablicę w kolejności odwrotnej niż podana.
Przykładowo dla tablicy [1, 5, 6, 9, 55] program zwraca tablicę [55, 9, 6, 5, 1].
Sygnatura metody odwracającej tablicę jest następująca:
public void reverse(int[] array)
*/

package powtorka.tydzien5.programowanie1.ex002.ex6;

public class Ex6 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5, 6};
        reverse(myArray);
    }

    public static void reverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i]);
    }
}
