/*
Uzupelnij cialo metody static String firstHalf(String str).
1. Uzupełnij ciało metody tak aby zwracała połowę napisu.
2. Uwzględniamy tylko część całkowitą podziału.
Przykład: dla napisu `CodersLab` zwróci `Code`.
*/

package powtorka.coderslab.day2.strings.ex6;

public class Ex6 {
    public static void main(String[] args) {
        String str = "ThIsIsMyStRiNg";
        System.out.println(firstHalf(str));
    }

    public static String firstHalf(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() / 2; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
