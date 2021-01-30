/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzona wartość zawiera słowo "ala".
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad4 {
    public Boolean checkStringForAla(String text) {
        Pattern pattern = Pattern.compile(".*ala.*");
        return pattern.matcher(text).matches();
    }
}
