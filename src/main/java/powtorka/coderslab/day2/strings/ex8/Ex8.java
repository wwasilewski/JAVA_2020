/*
Metoda static String stringFromArray(String[] str)`.
1. Uzupełnij by zwracała napis powstały z połączenia napisów występujących w tablicy `str`
*/

package powtorka.coderslab.day2.strings.ex8;

public class Ex8 {
    public static void main(String[] args) {
        String[] str = {"ThIs", "Is", "My", "StRiNg"};
        System.out.println(stringFromArray(str));
    }

    public static String stringFromArray(String[] str) {
        return String.join("", str);
    }
}
