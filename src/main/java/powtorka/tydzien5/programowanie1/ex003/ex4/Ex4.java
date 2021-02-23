/*
Napisz program, który pobiera od użytkownika wyraz lub zdanie i usuwa z niego
polskie znaki diakrytyczne. Przykładowo zdanie “Zażółć gęślą jaźń” zostanie
zamienione na “Zazolc gesla jazn”.
*/

package powtorka.tydzien5.programowanie1.ex003.ex4;

import java.util.HashMap;
import java.util.Map;

public class Ex4 {

    Map<Character, Character> map = new HashMap<>() {
        {
            put('Ą', 'A');
            put('ą', 'a');
            put('Ę', 'E');
            put('ę', 'e');
            put('Ó', 'O');
            put('ó', 'o');
            put('Ł', 'L');
            put('ł', 'l');
            put('Ń', 'N');
            put('ń', 'n');
            put('Ż', 'Z');
            put('ż', 'z');
            put('Ź', 'Z');
            put('ź', 'z');
            put('Ś', 'S');
            put('ś', 's');
            put('Ć', 'C');
            put('ć', 'c');
        }
    };

    public String removePolishSymbols(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            if (map.containsKey(character)) {
                sb.append(map.get(character));
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public String removePolishSymbols2(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                str = str.replace(str.charAt(i), map.get(str.charAt(i)));
            }
        }
        return str;
    }
}
