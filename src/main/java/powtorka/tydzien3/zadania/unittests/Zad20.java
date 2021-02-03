/*
Przygotuj aplikację pobierającą od użytkownika imię i sprawdzającą ile samogłosek i
ile spółgłosek jest podanym imieniu. Przygotuj klasę z 2 metodami sprawdzającymi
ilość samogłosek i ilość spółgłosek. Przygotuj testy jednostkowe weryfikujące
działanie dwóch metod.
*/

package powtorka.tydzien3.zadania.unittests;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad20 {

    private final Set<Character> VOWELS = Stream.of('a', 'e', 'i', 'o', 'u', 'y', 'ą', 'ę', 'ó').collect(Collectors.toSet());
    private final Set<Character> CONSONANTS = Stream.of('q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j',
            'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'ł', 'ć', 'ż', 'ź', 'ń', 'ś').collect(Collectors.toSet());

    public int countVowels(String text) {
        return countCharacters(text, VOWELS);
    }

    public int countConsonants(String text) {
        return countCharacters(text, CONSONANTS);
    }

    public int countCharacters(String text, Set<Character> pattern) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (pattern.contains(text.toLowerCase().charAt(i))) {
                result++;
            }
        }
        return result;
    }
}
