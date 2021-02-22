/*
static String replaceChar(String str, char forReplace, char replacement)
1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
 wszystkich znaków `forReplace` przez znaki `replacement`.
*/

package powtorka.coderslab.day2.homework.ex5;

public class Ex5 {
    public static void main(String[] args) {
        String str = "my test string";
        System.out.println(replaceChar(str, 't', 'T'));
    }

    public static String replaceChar(String str, char forReplace, char replacement) {
        return str.replace(forReplace, replacement);
    }
}
