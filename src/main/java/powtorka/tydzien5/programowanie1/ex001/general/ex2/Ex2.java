/*
Przygotuj program, który pobiera od użytkownika 3 liczby, a następnie wskazuje
największą oraz najmniejszą z nich. Dodatkowo program oblicza sumę podanych
liczb.
Zaktualizuj program, aby umożliwiał użytkownikowi przekazanie dowolnej liczby
parametrów.
*/

package powtorka.tydzien5.programowanie1.ex001.general.ex2;

import powtorka.TextColor;
import powtorka.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> numbers = howManyNumbers();
        printResults(numbers);
    }

    public static int biggestInt(List<Integer> numbers) {
        int biggest = numbers.get(0);
        for (int b : numbers) {
            if (b > biggest) {
                biggest = b;
            }
        }
        return biggest;
    }

    public static int smallestInt(List<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int s : numbers) {
            if (s < smallest) {
                smallest = s;
            }
        }
        return smallest;
    }

    public static int sumInt(List<Integer> numbers) {
        int sum = 0;
        for (int s : numbers) {
            sum += s;
        }
        return sum;
    }

    public static List<Integer> howManyNumbers() {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        Utils.displayTextOnConsole(TextColor.ANSI_BLUE, "provide a number, \"0\" ends the program: ");
        int number;
        while ((number = sc.nextInt()) != 0) {
            numbers.add(number);
            Utils.displayTextOnConsole(TextColor.ANSI_PURPLE, "provide another number: ");
        }
        return numbers;
    }

    public static void printResults(List<Integer> numbers) {
        System.out.println("biggest: " + biggestInt(numbers));
        System.out.println("smallest: " + smallestInt(numbers));
        System.out.println("sum: " + sumInt(numbers));
    }
}
