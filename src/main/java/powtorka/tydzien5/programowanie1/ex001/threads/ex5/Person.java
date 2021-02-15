/*
Przygotuj aplikację wielowątkową. Niech każdy z wątków tworzy osobą i zapisuje ją
do indywidualnego pliku w formacie JSON o rozszerzeniu .json
a. Osoba ma następujące pola: Imię, Nazwisko, wiek
b. Przygotuj listę 10 unikatowych imion
c. Przygotuj listę 10 unikatowych nazwisk
d. Każdy wątek powinien wylosować imię i nazwisko z listy
e. Każdy wątek losuje wiek z zakresu 1-99 lat
f. Nazwa pliku ma być losowana w każdym wątku.
g. Po zakończeniu pracy wszystkich wątków główny program wyświetli nazwy
plików wygenerowane przez wątki.
*/

package powtorka.tydzien5.programowanie1.ex001.threads.ex5;

import lombok.Data;

@Data
public class Person {
    private String firstname;
    private String lastname;
    private Integer age;
}
