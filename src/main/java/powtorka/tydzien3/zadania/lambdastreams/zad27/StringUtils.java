/*
Przygotuj interfejs funkcyjny, a w nim metodę, która będzie pobierać 2 zmienne typu
String i zwracać Boolean. Następnie przygotuj metodę statyczną betterString
przyjmującą jako argumenty 2 zmienne typu String oraz predykat (przygotowany
wcześniej interfejs funkcyjny) tak aby poniższy kod się kompilował i działał.
String string1 = "test" ;
String string2 = "testtest" ;
String longer = StringUtils. betterString (string1, string2,(s1, s2) -> s1.length() > s2.length());
String first = StringUtils. betterString (string1, string2,(s1, s2) -> true );
System. out .println(longer); // zwraca dłuższy wyraz
System. out .println(first); // zwraca zmienną string1
*/

package powtorka.tydzien3.zadania.lambdastreams.zad27;

public class StringUtils {
    public static String betterString(String arg1, String arg2, CompareString comparator) {
        if (comparator.betterString(arg1, arg2)) {
            return arg1;
        } else {
            return arg2;
        }
    }
}
