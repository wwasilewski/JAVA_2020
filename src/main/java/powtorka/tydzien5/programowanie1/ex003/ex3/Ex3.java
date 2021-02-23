/*
Napisz program, który pobiera od użytkownika wyraz lub zdanie i tworzy z niego
odwrotność. Dla słowa “grzegżółka” program zwraca “akłóżgezrg”.
*/

package powtorka.tydzien5.programowanie1.ex003.ex3;

public class Ex3 {

    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
