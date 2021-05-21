/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzona wartość jest wartością liczbową. Jeśli użytkownik wprowadził
liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
nieparzystości.
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad1B implements Zad1BValidator {

    private final Pattern PATTERN = Pattern.compile("^\\d+$");

    public Boolean isEven(String string) {
        return Integer.parseInt(string) % 2 == 0;
    }

    public Boolean isOdd(String string) {
        return Integer.parseInt(string) % 2 != 0;
    }

    @Override
    public Boolean isValid(String string) {
        return PATTERN.matcher(string).matches();
    }
}
