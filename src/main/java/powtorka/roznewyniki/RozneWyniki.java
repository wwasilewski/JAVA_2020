/*
Napisz program, który wypisze wyniki poniższych działań
1) 2 + 3
2) 2 - 4
3) 5 / 2
4) 5.0 / 2.0
5) 100L – 10
6) 2f – 3
7) 5f / 2
8) 5d / 2
9) ’a’ + 2
10) ”ab” + ”c”
11) 9 % 4
12) ’a’ + 3 + ”b”
Zastanów się nad otrzymanymi wynikami.
 Czy zgadzają się z Twoimi oczekiwaniami?
 Określ jakiego typu jest wynik.
 Przypisz je przed wyświetleniem do zmiennych odpowiedniego typu.
*/

package powtorka.roznewyniki;

public class RozneWyniki {
    public static void main(String[] args) {

//        1) 2 + 3 - wynik int
        int _1a = 2, _1b = 3;
        System.out.println("2+3 = " + (_1a + _1b));

//        2) 2 - 4 - wynik int
        int _2a = 2, _2b = 4;
        System.out.println("2-4 = " + (_2a - _2b));

//        3) 5 / 2 - dwa inty to wynik bedzie int
        int _3a = 5, _3b = 2;
        System.out.println("5/2 = " + (_3a / _3b));

//        4) 5.0 / 2.0 - wynik double
        float _4a = 5f, _4b = 2f;
        System.out.println("5.0/2.0 = " + (_4a / _4b));

//        5) 100L - 10 - wynik long
        long _5a = 100L;
        int _5b = 10;
        System.out.println("100L-10 = " + (_5a - _5b));

//        6) 2f - 3 - wynik double
        float _6a = 2f;
        int _6b = 3;
        System.out.println("2f-3 = " + (_6a - _6b));

//        7) 5f / 2 - wynik double
        float _7a = 5f;
        int _7b = 2;
        System.out.println("5f/2 = " + (_7a / _7b));

//        8) 5d / 2 - wynik double
        double _8a = 5d;
        int _8b = 2;
        System.out.println("5d/2 = " + (_8a / _8b));

//        9) ’a’ + 2 - wynik int? 99 bo char 'a' jest 97 w tabeli decimal ascii
        char _9a = 'a';
        int _9b = 2;
        System.out.println("’a’+2 = " + (_9a + _9b));

//        10) ”ab” + ”c” - wynik String? abc
        String _10a = "ab", _10b = "c";
        System.out.println("\"ab\"+\"c\" = " + (_10a + _10b));

//        11) 9 % 4 - wynik 1
        int _11a = 9, _11b = 4;
        System.out.println("9%4 = " + (_11a % _11b));

//        12) ’a’ + 3 + ”b” - wynik String? 97+3+b
        char _12a = 'a';
        int _12b = 3;
        String _12c = "b";
        System.out.println("'a'+3+\"b\" = " + (_12a + _12b + _12c));
    }
}
