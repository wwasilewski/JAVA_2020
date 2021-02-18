/*
Napisz metodę `calculateNet`, która przyjmie argumenty:
`gross`, czyli kwotę brutto ceny zakupu,
`vat`, czyli wartość podatku VAT. Możesz założyć,
że VAT ma być liczbą zmiennoprzecinkową z zakresu 0-1.
Funkcja ma zwrócić wartość netto ceny. Jakie obliczenia musisz wykonać?
*/

package powtorka.coderslab.day1.methods.ex5;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(calculateNet(123, 0.23f));
    }

    public static double calculateNet(float gross, float vat) {
        return gross / (1 + vat);
    }
}
