/*
Napisz program, który pobiera od użytkownika wyraz lub zdanie i sprawdza czy
wprowadzony ciąg znaków jest palindromem. Przykładowy palindrom to “kajak” lub
“Może jutro ta dama da tortu jeżom”. Program po analizie wyświetla komunikat:
Wprowadzony ciąg znaków “<wprowadzone_znaki>” jest palindromem lub
Wprowadzony ciąg znaków “<wprowadzone_znaki>” nie jest palindromem
*/

package powtorka.tydzien5.programowanie1.ex003.ex5;

public class Ex5 {

    public boolean checkIfPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public void printAll(String str) {
        if (checkIfPalindrome(str)) {
            System.out.println("string is a palindrome");
        } else {
            System.out.println("string is not a palindrome");
        }
    }
}
