/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzjącą
czy wprowadzona data jest poprawna. Za poprawną datę uważamy zapis w postaci
"10.02.2018r.". Na potrzeby zadania nie weryfikujemy wartości dnia miesiąca. 45 to
też poprawna wartość (ale ja mam zweryfikowana).
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad5 {
    public Boolean checkForValidDate(String text) {
        Pattern pattern = Pattern.compile("^(3[01]|[12][0-9]|0[1-9]).(1[0-2]|0[1-9]).[0-9]{4}r.$");
        return pattern.matcher(text).matches();
    }
}
