/*
Spróbuj przekonwertować następujące wartości:
        1) short - > int
        2) short -> long
        3) int -> float
        4) int -> double
        5) long -> int
        6) short -> byte
        7) char -> int
*/

package powtorka.konwersjetypow;

public class KonwersjeTypow {
    public static void main(String[] args) {

//        1) short - > int
        short _1a = 100;
        int _1b = _1a;
        System.out.println(_1b);

//        2) short -> long
        short _2a = 100;
        long _2b = _2a;
        System.out.println(_2b);

//        3) int -> float
        int _3a = 100;
        float _3b = _3a;
        System.out.println(_3b);

//        4) int -> double
        int _4a = 100;
        double _4b = _4a;
        System.out.println(_4b);

//        5) long -> int - trzeba castowac bo long>int
        long _5a = 100;
        int _5b = (int) _5a;
        System.out.println(_5b);

//        6) short -> byte - trzeba castowac bo short>byte
        short _6a = 100;
        byte _6b = (byte) _6a;
        System.out.println(_6b);

//        7) char -> int
        char _7a = 'a';
        int _7b = _7a;
        System.out.println(_7a);
        System.out.println(_7b);
    }
}
