/*
Przygotuj program dodający n liczb wprowadzonych przez użytkownika. Operacje
dodawania powinny być w osobnej klasie. Metoda w klasie powinna zwracać sumę
dodawania i przyjmować wiele argumentów. Skorzystaj z varargs. Nie przekazuj liczb
do sumowania jako kolekcję. Napisz testy jednostkowe sprawdzające poprawność
sumowania.
*/

package powtorka.tydzien5.programowanie1.ex007.ex3;

public class Ex3 {

    public int sumOfNumbers(int... number) {
        int sum = 0;
        for (int i : number) {
            sum += i;
        }
        return sum;
    }
}
