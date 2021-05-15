/*
Utwórz klasę Point zawierającą zmienne int x oraz int y. Dodaj 10 punktów do listy
List<Point>. Korzystając ze strumieni posortuj punkty według współrzędnej x i
wyświetl posortowaną tablicę.
*/

package powtorka.tydzien5.programowanie1.ex010.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point {
    private int x, y;
}
