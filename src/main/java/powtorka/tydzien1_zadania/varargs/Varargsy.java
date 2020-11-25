/*
1. Napisz metodę łączącą (sklejającą) ciągi znaków – używając varargs.
2. Napisz metodę sumującą dowolną ilość liczb – używając varargs
3. Napisz metodę obliczającą średnią z dowolnej ilości liczb – używając varargs
*/

package powtorka.tydzien1_zadania.varargs;

public class Varargsy {

    public String laczCiagiZnakow(String... s) {

        String ciag = "";
        for (String polaczone : s) {
            ciag += polaczone;
        }
        return ciag;
    }

    public String laczCiagiZnakow2(String... x) {

        String poczatek = "";
        for (int i = 0; i < x.length; i++) {
            poczatek += x[i];
        }
        return poczatek;
    }

    public int sumujInty(int... x) {

        int suma = 0;
        for (int s : x) {
            suma += s;
        }
        return suma;
    }

    public int sumujInty2(int... x) {

        int suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
        }
        return suma;
    }

    public double srednia(double... x) {

        double suma = 0;
        int counter = 0;
        for (double d : x) {
            suma += d;
            counter++;
        }
        return suma / counter;
    }

    public double srednia2(double... x) {

        double suma = 0;
        int counter = 0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
            counter++;
        }
        return suma / counter;
    }
}
