/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzona wartość jest liczbą całkowitą. Jeśli użytkownik wprowadził
liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
nieparzystości.
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad1 {
    public Boolean checkIfNumber(String text) {
        Pattern pattern = Pattern.compile("-?[0-9]*");
        Boolean bool = pattern.matcher(text).matches();
        return bool;
    }
}
