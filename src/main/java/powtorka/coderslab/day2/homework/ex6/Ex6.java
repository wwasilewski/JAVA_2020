/*
static String replaceStr(String str, String forReplace, String replacement)`.
1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
 wszystkich wystąpień napisu `forReplace` przez napis `replacement`.

*/

package powtorka.coderslab.day2.homework.ex6;

public class Ex6 {
    public static void main(String[] args) {
        String str = "My string to change";
        System.out.println(replaceStr(str, "to", "didn't"));
    }

    public static String replaceStr(String str, String forReplace, String replacement) {
        return str.replace(forReplace, replacement);
    }
}
