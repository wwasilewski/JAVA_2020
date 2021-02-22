/*
static int tripple(String str)`
1. Metoda zwraca ilość potrójnych wystąpień znaków w napisie
Przykład dla qazbbbwsx -> 1, dla aaawsxbbb ->2
*/

package powtorka.coderslab.day2.homework.ex4;

public class Ex4 {
    public static void main(String[] args) {
        String str = "aaadddvasazzz";
        System.out.println(tripple(str));
    }

    public static int tripple(String str) {
        int counter = 0;
        for (int i = 2; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == str.charAt(i - 1)) {
                if (c == str.charAt(i - 2)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
