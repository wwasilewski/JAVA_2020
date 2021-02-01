package powtorka.tydzien3.zadania.generics.smartcontainer2;

public interface ContainerOperation<T> {
    public void addToList(T element);

    public T getFromList(int index);

    public void updateElement(int index, T element);

    public void printElement(int index);

    public void printAll();
}
