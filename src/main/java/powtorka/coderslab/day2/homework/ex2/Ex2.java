/*
umieść zmodyfikowaną metodę z zadania domowego 1: static String encode(String str, int shift)
1. shift - oznacza przesunięcie znaków
2. Dodaj metodę deszyfrującą static String decode(String str, int shift)
*/

package powtorka.coderslab.day2.homework.ex2;

public class Ex2 {
    public static void main(String[] args) {
        String string = "this is my string to encode xyz";
        System.out.println(encode(string, 3));

        String stringToDecode = encode(string, 3);
        System.out.println(decode(stringToDecode, 3));
    }

    public static String encode(String str, int shift) {
        StringBuilder sb = new StringBuilder();

        for (char character : str.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPos = character - 'a';
                int newAlphabetPos = (originalAlphabetPos + shift) % 26;
                char newCharacter = (char) ('a' + newAlphabetPos);
                sb.append(newCharacter);
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public static String decode(String str, int shift) {
        return encode(str, 26 - (shift % 26));
    }
}
