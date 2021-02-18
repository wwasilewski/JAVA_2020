/*
Napisz metodę `checkEven`, która:
* przyjmie parametr liczbowy `number`,
* będzie zwracać wartość typu `String`,
* jeśli liczba jest parzysta, zwróci wynik "even",
* jeśli liczba jest nieparzysta, zwróci wynik "odd".
*/

package powtorka.coderslab.day1.methods.ex7;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(checkEven(13));
    }

    public static String checkEven(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }
}
