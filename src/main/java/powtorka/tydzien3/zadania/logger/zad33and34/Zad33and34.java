/*
Utwórz aplikację, która będzie pobierała od użytkownika imię i wyświetlała je na
konsoli korzystając z log4J (nie używaj w tym celu polecenia System.out.print*)
a. Dodaj do projektu plik konfiguracyjny log4j
b. Utwórz w klasie Logger odpowiedzialny za logowanie w klasie
c. Zaloguj wprowadzone imię przez użytkownika.
d. Dodaj logi w trybie INFO informujące u uruchomieniu i zamknięciu aplikacji.
e. Ustaw poziom logowania na info i sprawdź czy logi pojawiły się w konsoli.
*/

package powtorka.tydzien3.zadania.logger.zad33and34;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Zad33and34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        log.info("start logging");
        System.out.println("provide your name to log: ");
        log.info(sc.nextLine());
        log.debug("debug test");
        log.error("error test");
        log.info("end logging");

        sc.close();
    }
}
