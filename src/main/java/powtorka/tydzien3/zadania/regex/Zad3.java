/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzona wartość jest poprawnym loginem użytkownika. Za poprawny login
uważamy tekst zawierający małe i duże litery oraz cyfry. Jego minimalna długość to 8
a maksymalna 16 znaków.
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad3 {
    public Boolean checkLogin(String text) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{8,16}$");
        return pattern.matcher(text).matches();
    }
}
