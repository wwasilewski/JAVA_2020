/*
Szyfr Cezara jest to szyfr za pomocą, którego Juliusz Cezar szyfrował swoje listy do Cycerona.
static String encode(String str)
1. Uzupełnij ciało metody tak, by zwracała napis zaszyfrowany szyfrem Cezara
*/

package powtorka.coderslab.day2.homework.ex1;

public class Ex1 {
    public static void main(String[] args) {
        String stringToEncode = "this is my string to encode xyz";
        System.out.println(encode(stringToEncode));
    }

    public static String encode(String str) {
        StringBuilder sb = new StringBuilder();

        for (char character : str.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPos = character - 'a';
                int newAlphabetPos = (originalAlphabetPos + 2) % 26;
                char newCharacter = (char) ('a' + newAlphabetPos);
                sb.append(newCharacter);
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }
}
