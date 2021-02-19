/*
Metoda o sygnaturze `static String[] onlyTwoElements(String str, char separator)`.
Uzupełnij ciało metody tak aby, zwracała tablicę dokładnie 2 elementów, podzielonych wg pierwszego
napotkanego znaku podziału. Przykład" dla napisu `Java-zadania-podzial-napisow` oraz
separatora `-` otrzymamy 1 element tablicy `Java`oraz 2 element `zadania-podzial-napisow`.

*/

package powtorka.coderslab.day2.strings2.ex4;

public class Ex4 {
    public static void main(String[] args) {
        String str = "Java-zadania-podzial-napisow";
        String[] twoElements = onlyTwoElements(str, '-');
        for (String s : twoElements) {
            System.out.println(s);
        }
    }

    public static String[] onlyTwoElements(String str, char separator) {
        return str.split(String.valueOf(separator), 2);
    }
}
