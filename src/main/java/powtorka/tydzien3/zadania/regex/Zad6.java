/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzony numer seryjny jest poprawny. Numer seryjny składa się z 3 dużych
liter, 5 cyfr, 1 małej litery i 1 dużej litery np. VSD43281fA.
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad6 {
    public Boolean checkForValidSerialNumber(String text) {
        Pattern pattern = Pattern.compile("^[A-Z]{3}[0-9]{5}[a-z][A-Z]$");
        return pattern.matcher(text).matches();
    }
}
