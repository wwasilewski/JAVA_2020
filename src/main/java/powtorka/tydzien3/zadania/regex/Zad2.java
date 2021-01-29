/*
Przygotuj aplikację pobierającą od użytkownika ciąg znaków i sprawdzającą czy
podany tekst jest poprawnym polskim kodem pocztowym (np. 85-155, 00-122)
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad2 {
    public Boolean checkIfPostal(String text) {
        Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{3}");
        return pattern.matcher(text).matches();
    }
}
