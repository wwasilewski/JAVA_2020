/*
Wykorzystując obiekt typu LocalDateTime wyświetl aktualną datę i godzinę.
*/

package powtorka.tydzien2.zadania.dataiczas;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Zad11 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDateTime);
    }
}
