/*
Napisz program rozwiązujący równanie kwadratowe ax2 + bx + c. Użytkownik musi
podać wartości a, b oraz c. Program musi sprawdzić czy wprowadzone liczby są
cyframi. Jeśli nie użytkownik musi podać wartości do momentu aż będą poprawne.
Korzystając z pętli switch wyznacz pierwiastki równania kwadratowego w zależności
od ilości rozwiązań (Mogą być 2, 1 lub wcale). Postaraj się przygotować klasę i
metodę odpowiedzialną za obliczanie rozwiązania. Klasa powinna zawierać metodę
o następującej sygnaturze (sygnatura do definicja metody składająca się z
modyfikatora dostępu, zwracanego typu, nazwy, oraz przyjmowanych argumentów)
public Solution calculate(int a, int b, int c)
*/

package powtorka.tydzien2.zadania.rozne.zad40;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Zad40 {

    private Solution solution;

    public Solution calculate(int a, int b, int c) {

        int delta = b * b - 4 * a * c;
        if (delta == 0) {
            solution.setX1(-b / (2.0 * a));
            System.out.println("delta = 0, " + solution.getX1());
        } else if (delta > 0) {
            solution.setX1((-b + Math.sqrt(delta)) / (2 * a));
            solution.setX2((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("delta > 0, " + solution.toString());
        } else {
            System.out.println("delta < 0, no solution");
        }
        return solution;
    }
}
