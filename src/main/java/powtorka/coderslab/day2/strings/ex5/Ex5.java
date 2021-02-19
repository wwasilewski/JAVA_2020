/*
W pliku `Main5.java` została umieszczona metoda o sygnaturze static int charPos(String str, char c).
1. Uzupełnij ciało metody tak aby zwracała pozycje na której w ciągu `str` znajduje się znak `s`.
*/

package powtorka.coderslab.day2.strings.ex5;

public class Ex5 {
    public static void main(String[] args) {
        String str = "ThIs Is My StRiNg";
        System.out.println(charPos(str, 's'));
    }

    public static int charPos(String str, char c) {
        return str.indexOf(c);
    }
}
