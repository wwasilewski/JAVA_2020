/*
Przygotuj aplikację pobierającą od użytkownika dowolny tekst. Wprowadzony tekst
powinien zostać podzielony na słowa (korzystając z metody split klasy String), a
następnie program powinien wyświetlić statystyki wpisanego przez użytkownika
tekstu.
Ilość słów: <ilość_słów>
Ilość wprowadzonych znaków: <ilość_znaków>
Średnia długość wprowadzonego słowa: <ilość_znaków>
Najdłuższe słowo: <ilość_znaków>
Najkrótsze słowo: <ilość_znaków>
Do testów użyj podanego zdania:
“Drogi Marszałku, Wysoka Izbo. PKB rośnie. Z pełną odpowiedzialnością mogę
stwierdzić iż realizacja określonych zadań stanowionych przez organizację. Dalszy
rozwój jest ważne zadanie w większym stopniu tworzenie odpowiednich warunków
aktywizacji. Często niezauważanym szczegółem jest to, że zakres i rozwijanie
struktur pociąga za najważniejszy punkt naszych działań obierzemy praktykę, nie zaś
teorię, okazuje się jasne.”
*/

package powtorka.tydzien3.zadania.regex;

public class Zad9 {
    public int numberOfWords(String text) {
        String[] textAfterSplit = text.split("[^A-Za-z0-9ąęóżźńśćł]+");
        return textAfterSplit.length;
    }

    public int numberOfCharacters(String text) {
        return text.length();
    }

    public int numberOfCharactersWithoutSpace(String text) {
        String removeSpace = text.replace(" ", "");
        return removeSpace.length();
    }

    public float averageLengthOfWord(String text) {
        return (float) numberOfCharactersWithoutSpace(text) / (float) numberOfWords(text);
    }

    public int longestWord(String text) {
        String[] arrayOfWords = text.split("[^A-Za-z0-9ąęóżźńśćł]+");
        int longestWord = arrayOfWords[0].length();
        for (String arrayOfWord : arrayOfWords) {
            if (arrayOfWord.length() > longestWord) {
                longestWord = arrayOfWord.length();
            }
        }
        return longestWord;
    }

    public int shortestWord(String text) {
        String[] arrayOfWords = text.split("[^A-Za-z0-9ąęóżźńśćł]+");
        int shortestWord = arrayOfWords[0].length();
        for (String arrayOfWord : arrayOfWords) {
            if (arrayOfWord.length() < shortestWord) {
                shortestWord = arrayOfWord.length();
            }
        }
        return shortestWord;
    }

    public void print(String text) {
        System.out.println("number of words: " + numberOfWords(text));
        System.out.println("number of characters: " + numberOfCharacters(text));
        System.out.println("number of characters without space: " + numberOfCharactersWithoutSpace(text));
        System.out.println("average length of a word:  " + averageLengthOfWord(text));
        System.out.println("longest word: " + longestWord(text) + " characters");
        System.out.println("shortest word: " + shortestWord(text) + " characters");
    }
}
