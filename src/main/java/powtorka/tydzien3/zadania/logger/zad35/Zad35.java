/*
Przygotuj aplikację która demonstruje poziomy działanie poziomów logowania.
Korzystając z loggera zaloguj dowolny komunikat dla każdego poziomu oddzielny.
Zmodyfikuj plik konfiguracyjny tak, aby każdy komunikat został zapisany do
oddzielnego pliku. Przykładowo poziom logowania TRACE powinien zostać zapisany
do pliku trace.log, DEBUG do debug.log itd.
*/

package powtorka.tydzien3.zadania.logger.zad35;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zad35 {
    public static void main(String[] args) {
        log.trace("tracelog test");
        log.debug("debuglog test");
        log.info("infolog test");
        log.warn("warnlog test");
        log.error("errorlog test");
    }
}
