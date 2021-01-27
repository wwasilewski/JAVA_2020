/*
Utwórz zmienną typu String, a następnie przypisz do niej imię “Olgierd”.
a. Wyświetl imię tak aby imię było wyświetlone dużymi literami
b. Wyświetl imię tak aby imię było wyświetlone małymi literami
c. Wyświetl długość imienia wykorzystująć odpowiednią metodę klasy String.
d. Korzystając z odpowiedniej metody sprawdź czy imię rozpoczyna się od litery “O”
e. Korzystając z odpowiedniej metody sprawdź czy imię zawiera literę “e”.
f. Korzystając z odpowiedniej metody usuń litery “i” oraz “e” z imienia, a
następnie wyświetl imię po zmianach.
g. Wykorzystując pętlę for wyświetl kolejno litery imienia wraz z ich indeksem.
Spodziewany rezultat wygląda następująco
[1] = O
[2] = l
[3] = g
[4] = i
[5] = e
[6] = r
[7] = d
*/

package powtorka.tydzien2.zadania.wyjatki;

public class Zad8 {
    public static void main(String[] args) {

        String name = "Olgierd";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.startsWith("O"));
        System.out.println(name.contains("e"));
        String newName = name.replaceAll("[ie]", "");
        System.out.println(newName);

        for (int i = 0; i < name.length(); i++) {
            System.out.println("[" + (i + 1) + "] = " + name.charAt(i));
        }
    }
}
