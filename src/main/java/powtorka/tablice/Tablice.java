/*
1. Utwórz tablicę z imionami, wyświetl imiona na konsoli
2. Utwórz tablicę reprezentującą poniższą macierz
        987
        127
        492
        123
*/
package powtorka.tablice;

import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {

        String[] names = {"Tom", "Ann", "Mark", "Wendy", "John"};

        System.out.println("names array: " + Arrays.toString(names));
        System.out.println("2nd name from array: " + names[1]);

        System.out.println("printing array using for-each loop: ");
        for (String s : names) {
            System.out.println(s);
        }

        System.out.println("printing array using for loop: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("printing array using while loop: ");
        int counter = 0;

        while (counter < names.length) {
            System.out.println(names[counter]);
            counter++;
        }

        System.out.println("printing array backwards using for loop: ");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int[][] numbers = {{9, 8, 7}, {1, 2, 7}, {4, 9, 2}, {1, 2, 3}};
        System.out.println(Arrays.deepToString(numbers));

        System.out.println("printing 2d array using for-each and for loop: ");
        for (int[] number : numbers) {
            for (int j = 0; j < numbers[j].length; j++) {
                System.out.print(number[j]);
            }
            System.out.println();
        }
    }
}
