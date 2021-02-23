/*
static String censor(String str, String[] words)`.
Metoda:
* rozbije łańcuch tekstowy na tablicę wyrazów,
* sprawdzi, czy nie znajdują się w nim słowa niedozwolone zawarte w tablicy `words`,
* jeśli tak -- zamieni je na cztery gwiazdki (****)
* ponownie połączy tablicę w string i zwróci wartość.
*/

package powtorka.coderslab.day2.homework.ex7;

import java.util.Arrays;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        String str = "My bloody string to test with forbidden bloody word.";
        String[] forbiddenWords = {"bloody", "puppy", "sweet", "to"};
        System.out.println(censor(str, forbiddenWords));
    }

    public static String censor(String str, String[] words) {
        List<String> listOfWords = Arrays.asList(str.split(" "));
        for (int i = 0; i < listOfWords.size(); i++) {
            for (String word : words) {
                if (listOfWords.get(i).equals(word)) {
                    listOfWords.set(i, "****");
                }
            }
        }
        return String.join(" ", listOfWords);
    }
}
