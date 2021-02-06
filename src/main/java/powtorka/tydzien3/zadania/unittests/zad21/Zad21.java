/*
Przygotuj klasę kalkulator posiadającą metody sum, divide, multiply, substract. Każda
z metod ma przyjmować dwie liczby i zwracać wynik. Przygotuj odpowiednią
implementację oraz testy jednostkowe sprawdzające działanie każdej z metod.
Zad36
Dodaj mechanizmy logowania do zadania 21 dla każdej metody wykonującej
działanie arytmetyczne. Każda metoda powinna zalogować informacje o rozpoczęciu
wykonywania obliczeń wraz z podanymi argumentami oraz informację o zakończeniu
obliczeń razem z wynikiem. Zmodyfikuj logger tak aby logi zapisywane były w
formacie html.
*/

package powtorka.tydzien3.zadania.unittests.zad21;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zad21 {

    public double sum(double x, double y) {
        log.info("adding {} and {}", x, y);
        log.info("result: {}", x + y);
        return x + y;
    }

    public double subtract(double x, double y) {
        log.info("subtracting {} and {}", x, y);
        log.info("result: {}", x - y);
        return x - y;
    }

    public double multiply(double x, double y) {
        log.info("multiplying {} and {}", x, y);
        log.info("result: {}", x * y);
        return x * y;
    }

    public double divide(double x, double y) throws Exception {
        log.info("dividing {} by {}", x, y);
        if (0 == y) {
            throw new Exception("can't divide by 0");
        }
        log.info("result: {}", x / y);
        return x / y;
    }
}
