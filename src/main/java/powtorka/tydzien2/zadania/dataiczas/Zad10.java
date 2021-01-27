/*
Wykorzystując obiekt typu LocalDate wyświetl aktualna date.
*/

package powtorka.tydzien2.zadania.dataiczas;

import java.time.LocalDate;

public class Zad10 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}
