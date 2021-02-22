/*
static String upperCase(String str, int index)
Metoda zwraca napis str, w którym znaki zostały zamienione na duże z pozycji
podzielnych przez `index`
*/

package powtorka.coderslab.day2.homework.ex3;

public class Ex3 {
    public static void main(String[] args) {
        String str = "abcdefghij";
        System.out.println(upperCase(str, 2));
    }

    public static String upperCase(String str, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i != 0 && i % index == 0) {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
