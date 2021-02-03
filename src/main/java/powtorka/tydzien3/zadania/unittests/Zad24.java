/*
Przygotuj program obliczający BMI. Przygotuj testy sprawdzające działanie programu
*/

package powtorka.tydzien3.zadania.unittests;

public class Zad24 {

    public float BMICalculator(float weight, float height) {
        return Math.round((weight / (height * height)) * 100) / 100f;
    }
}
