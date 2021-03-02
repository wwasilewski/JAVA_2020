/*
Napisz program, który umożliwi użytkownikowi wpisanie dowolnej liczby całkowitej z
zakresu [1-99], po czym wyświetli ją w konsoli w postaci słownej. Np. 23 ->
dwadzieścia trzy
*/

package powtorka.tydzien5.programowanie1.ex009.ex1;

import java.util.HashMap;
import java.util.Map;

public class NumberConverter {

    private Map<Integer, String> unityMap = new HashMap<>();
    private Map<Integer, String> tensMapUnder20 = new HashMap<>();
    private Map<Integer, String> tensMap = new HashMap<>();

    public NumberConverter() {
        unityMap.put(1, "one");
        unityMap.put(2, "two");
        unityMap.put(3, "three");
        unityMap.put(4, "four");
        unityMap.put(5, "five");
        unityMap.put(6, "six");
        unityMap.put(7, "seven");
        unityMap.put(8, "eight");
        unityMap.put(9, "nine");

        tensMapUnder20.put(10, "ten");
        tensMapUnder20.put(11, "eleven");
        tensMapUnder20.put(12, "twelve");
        tensMapUnder20.put(13, "thirteen");
        tensMapUnder20.put(14, "fourteen");
        tensMapUnder20.put(15, "fifteen");
        tensMapUnder20.put(16, "sixteen");
        tensMapUnder20.put(17, "seventeen");
        tensMapUnder20.put(18, "eighteen");
        tensMapUnder20.put(19, "nineteen");

        tensMap.put(2, "twenty");
        tensMap.put(3, "thirty");
        tensMap.put(4, "forty");
        tensMap.put(5, "fifty");
        tensMap.put(6, "sixty");
        tensMap.put(7, "seventy");
        tensMap.put(8, "eighty");
        tensMap.put(9, "ninety");
    }

    public String convertToString(Integer number) {
        if (number < 1 || number > 99) {
            throw new IllegalArgumentException("number out of range");
        }
        String result;
        if (number < 10) {
            result = unityMap.get(number);
        } else if (number < 20) {
            result = tensMapUnder20.get(number);
        } else {
            Integer tensNumber = number / 10;
            Integer unityNumber = number % 10;
            result = tensMap.get(tensNumber) + " " + unityMap.get(unityNumber);
        }
        return result;
    }
}
