/*
1. Stwórz tablicę z elementami od 0 do 50  np. z kolejnymi liczbami całkowitymi, zmienną z tablicą nazwij `mainTab`
2. Następnie wypisz na konsoli po kolei elementy tej tablicy w wierszach po 10.
3. Liczby jednocyfrowe przedstaw formie z dodatkowym zerem na początku np.: 03.
00, 01, 02, 03, 04, 05, 06, 07, 08, 09,
10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
*/

package powtorka.coderslab.day1.arrays.ex1;

public class Ex1 {
    public static void main(String[] args) {
        int[] mainTab = new int[51];
        for (int i = 0; i < mainTab.length; i++) {
            mainTab[i] = i;
        }
        for (int i = 0; i < mainTab.length; i++) {
            if (i < 10) {
                System.out.print("0" + i + ", ");
            } else {
                System.out.print(i + ", ");
            }
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
