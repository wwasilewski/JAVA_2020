/*
Przygotuj aplikację konsolową, która pobiera od użytkownika imię i wyświetla go na
konsoli. Do aplikacji dodaj logi informujące o wyświetleniu komunikatu
użytkownikowi, następnie po pobraniu imienia zalogowaniu informacji "Podano imię
<podane_imie>". Przygotuj 2 implementację mechanizmu logowania. Jedna
wyświetla informacje na konsoli, druga zapisuje logi do pliku. Przygotuj wspólny
interfejs dla mechanizmu logowania i wykorzystaj go w aplikacji.
*/

package powtorka.tydzien5.programowanie1.ex001.interfaces;

public interface UserLogin {
    void handleLogin();
}
