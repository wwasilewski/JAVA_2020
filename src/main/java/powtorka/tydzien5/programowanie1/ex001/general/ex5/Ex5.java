/*
Przygotuj program, który losuje 100 wartości z przedziału 0-200 korzystając z klasy
Random. Program po losowaniu zlicza powtórzenia każdej z liczb i wyświetla 5 liczb
które najczęściej się powtarzają w kolejności malejącej..
*/

package powtorka.tydzien5.programowanie1.ex001.general.ex5;

import powtorka.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Ex5 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Map<Integer, Integer> numbers = generateNumbersAndOccurrences(100);
        Utils.displayTextOnConsole("Map: " + numbers.toString());
        printNumbers(numbers);
    }

    public static Map<Integer, Integer> generateNumbersAndOccurrences(int howManyNumbers) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < howManyNumbers; i++) {
            Integer randomNumber = random.nextInt(200);
            if (!numbers.containsKey(randomNumber)) {
                numbers.put(randomNumber, 1);
            } else {
                numbers.put(randomNumber, numbers.get(randomNumber) + 1);
            }
        }
        return numbers;
    }

    public static void printNumbers(Map<Integer, Integer> numbers) {
        List<Integer> listOfMaxNumbers = numbers.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("5 elements with most occurrences descending: " + listOfMaxNumbers);
    }
}
