/*
Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
Wyświetl ile czasu minęło pomiędzy datami.
*/

package powtorka.tydzien2.zadania.dataiczas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Zad12 {
    public static void main(String[] args) {

        LocalDate firstDate = LocalDate.of(2017, 01, 01);
        LocalDate secondDate = LocalDate.of(2017, 05, 05);
        Period period = Period.between(secondDate, firstDate);
        System.out.println(period);
        System.out.println(ChronoUnit.DAYS.between(firstDate, secondDate));
    }
}
