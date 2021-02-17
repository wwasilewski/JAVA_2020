/*
Napisz program, który sprawdza czy w danej tablicy “array” znajduje się szukana
liczba “key”. Sygnatura metody jest następująca:
public boolean contains(int[] array, int key)
*/

package powtorka.tydzien5.programowanie1.ex002.ex3;

public class Ex3 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        System.out.println(contains(myArray, 3));
    }

    public static boolean contains(int[] array, int key) {
        for (int i : array) {
            if (i == key)
                return true;
        }
        return false;
    }
}
