/*
Wykorzystując obiekt typu LocalTime wyświetl aktualny czas.
*/

package powtorka.tydzien2.zadania.dataiczas;

import java.time.LocalTime;

public class Zad9 {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
