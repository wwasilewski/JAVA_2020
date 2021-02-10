/*
Przygotuj program, który pobiera od użytkownika 3 liczby, a następnie wskazuje
największą oraz najmniejszą z nich. Dodatkowo program oblicza sumę podanych
liczb.
*/

package powtorka.tydzien5.programowanie1.ex001.general.ex1;

import powtorka.Utils;

public class Ex1 {
    public static void main(String[] args) {
        String number1 = Utils.displayTextAndGetValue("provide 1st int number: ", true);
        String number2 = Utils.displayTextAndGetValue("provide 2nd int number: ", true);
        String number3 = Utils.displayTextAndGetValue("provide 3rd int number: ", true);
        printAll(Integer.parseInt(number1), Integer.parseInt(number2), Integer.parseInt(number3));
    }

    public static int biggestInt(int number1, int number2, int number3) {
        int biggest = number1;
        if (number2 > biggest) {
            biggest = number2;
        }
        if (number3 > biggest) {
            biggest = number3;
        }
        return biggest;
    }

    public static int smallestInt(int number1, int number2, int number3) {
        int smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        return smallest;
    }

    public static int sumInt(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static void printAll(int number1, int number2, int number3) {
        System.out.println("biggest: " + biggestInt(number1, number2, number3));
        System.out.println("smallest:" + smallestInt(number1, number2, number3));
        System.out.println("sum: " + sumInt(number1, number2, number3));
    }
}
