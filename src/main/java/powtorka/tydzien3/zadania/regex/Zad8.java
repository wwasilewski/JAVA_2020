/*
Przygotuj wyrażenie regularne sprawdzające czy numer faktury VAT jest poprawny.
Przykładowy numer faktury to "FV/1024/02/2018", gdzie
FV - stały wpis
/ - stały znak rozdzielający sekcje
1024 - kolejny numer faktury w danym miesiącu. Numer rozpoczyna się od 1
/ - stały znak rozdzielający sekcje
02 - numer miesiąca w danym roku kalendarzowym
/ - stały znak rozdzielający sekcje
2018 - rok
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad8 {
    public Boolean checkInvoiceNumber(String text) {
        Pattern pattern = Pattern.compile("^(FV\\/)[0-9]+\\/(1[0-2]|0[1-9])\\/[0-9]{4}$");
        return pattern.matcher(text).matches();
    }
}
