package powtorka.tydzien3.zadania.generics.zad14;

public class Clipboard<T extends BasePerson> {
    private T element;

    public void insertIntoClipboard(T item) {
        element = item;
    }

    public T getFromClipboard() {
        return element;
    }
}
