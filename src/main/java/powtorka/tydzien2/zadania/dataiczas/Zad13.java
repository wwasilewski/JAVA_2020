/*
Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
czasu upłynęło pomiędzy godzinami.
*/

package powtorka.tydzien2.zadania.dataiczas;

import java.time.Duration;
import java.time.LocalTime;

public class Zad13 {
    public static void main(String[] args) {

        LocalTime firstLocalTime = LocalTime.of(14, 11);
        LocalTime secondLocalTime = LocalTime.of(18, 41);
        Duration duration = Duration.between(secondLocalTime, firstLocalTime);
        System.out.println(duration);
    }
}
