/*
Przygotuj generyczną klasę Clipboard przechowującą obiekt typu T. Klasa powinna
mieć metody insertIntoClipboard oraz getFromClipboard.
*/

package powtorka.tydzien3.zadania.generics;

public class Clipboard<T> {
    private T element;

    public void insertIntoClipboard(T item) {
        element = item;
    }

    public T getFromClipboard() {
        return element;
    }
}
