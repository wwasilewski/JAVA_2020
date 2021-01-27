/*
Wyświetla bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby
wyświetlić datę w następującym formacie: 3 lutego 2018 roku, sobota 22:12:27
*/

package powtorka.tydzien2.zadania.dataiczas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Zad15 {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern
                ("d MMMM yyyy 'roku, 'EEEE HH:mm:ss", new Locale("pl")));
        System.out.println(formattedDateTime);
    }
}
