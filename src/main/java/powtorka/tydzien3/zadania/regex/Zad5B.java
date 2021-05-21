/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzjącą
czy wprowadzona data jest poprawna. Za poprawną datę uważamy zapis w postaci
"10.02.2018r.". Na potrzeby zadania nie weryfikujemy wartości dnia miesiąca. 45 to
też poprawna wartość.
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad5B implements GeneralValidator {

    public final Pattern PATTERN = Pattern.compile("^\\d{2}.\\d{2}.\\d{4}r\\.$");

    @Override
    public Boolean isValid(String string) {
        return PATTERN.matcher(string).matches();
    }
}
