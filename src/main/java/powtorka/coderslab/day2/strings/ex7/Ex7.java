/*
Metoda o sygnaturze `static boolean containsStr(String str, String search)`.
1. Uzupełnij ciało metody tak aby zwracała informacje czy zmienna `str` zawiera
 w sobie element napisu ze zmiennej `search`
*/

package powtorka.coderslab.day2.strings.ex7;

public class Ex7 {
    public static void main(String[] args) {
        String str = "ThIsIsMyStRiNg";
        System.out.println(containsStr(str, "MySt"));
    }

    public static boolean containsStr(String str, String search) {
        return str.contains(search);
    }
}
