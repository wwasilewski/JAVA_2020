/*
Palindrom to słowo lub zdanie, które czytane wspak brzmi tak samo, jak od początku, np. "kajak".
1. Dla znajdującej się w pliku zmiennej `str` sprawdzi czy jest on palindromem
2. Podczas sprawdzania palindromu, zignoruj spacje.
*/

package powtorka.coderslab.day2.strings.ex2;

public class Ex2 {
    public static void main(String[] args) {
        String[] str = {"kobyla ma maly bok", "radar", "kajjak", "notpalindrome"};
        for (String s : str) {
            System.out.println(s + ": " + checkPalindrome(s));
        }
    }

    public static boolean checkPalindrome(String string) {
        string = string.replace(" ", "");
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
