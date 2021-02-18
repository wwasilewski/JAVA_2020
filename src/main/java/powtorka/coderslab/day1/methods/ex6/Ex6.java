/*
Napisz metodę `checkMaturity`, która:
* przyjmie parametr liczbowy `age`, który oznacza wiek użytkownika,
* sprawdzi czy użytkownik jest pełnoletni,
* jeśli jest zwróci wartość `true`,
* jeśli nie zwróci wartość `false`.
*/

package powtorka.coderslab.day1.methods.ex6;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println(checkMaturity(19));
    }

    public static boolean checkMaturity(int age) {
        return age > 17;
    }
}
