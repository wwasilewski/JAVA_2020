/*
Napisz program, który będzie obliczał wynik podanego przez użytkownika wyrażenia
matematycznego.
a. Użytkownik podaje wyrażenie w postaci “2+3”. Program zwraca wynik 5
b. Przygotuj klasę o nazwie Calculator wykonującą wszystkie obliczenia
i. dodawanie
ii. odejmowanie
iii. mnożenie
iv. dzielenie
v. potęgowanie
c. Przygotuj testy jednostkowe do klasy Calculator
d. Dodaj mechanizm logowania każdej operacji korzystając z LOG4J
*/

package powtorka.tydzien5.programowanie1.ex009.ex5;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

    public int sum(int number1, int number2) {
        log.info("{} + {} = {} ", number1, number2, number1 + number2);
        return number1 + number2;
    }

    public int subtract(int number1, int number2) {
        log.info("{} - {} = {} ", number1, number2, number1 - number2);
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        log.info("{} * {} = {} ", number1, number2, number1 * number2);
        return number1 * number2;
    }

    public double divide(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("can't divide by 0");
        }
        log.info("{} / {} = {} ", number1, number2, number1 / (double) number2);
        return number1 / (double) number2;
    }

    public double exponent(double number1, double number2) {
        log.info("{}^{} = {} ", number1, number2, Math.pow(number1, number2));
        return Math.pow(number1, number2);
    }
}
