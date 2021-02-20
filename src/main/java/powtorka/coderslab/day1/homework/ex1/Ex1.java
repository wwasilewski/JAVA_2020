/*
static double dogAge(double dogAge) , która przeliczy wiek psa w psich latach.
* funkcja powinna przyjmować wiek psa jako parametr,
* dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
* powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
* funkcja powinna zwrócić wiek psa.
*/

package powtorka.coderslab.day1.homework.ex1;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(dogAge(5));
    }

    public static double dogAge(double dogAge) {
        if (dogAge <= 2) {
            return dogAge * 10.5;
        } else {
            return 21 + (dogAge - 2) * 4;
        }
    }
}
