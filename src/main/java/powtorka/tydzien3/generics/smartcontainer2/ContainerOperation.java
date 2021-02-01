package powtorka.tydzien3.generics.smartcontainer2;

public interface ContainerOperation<T> {
    void addToList(T element);

    T getFromList(int index);

    void updateElement(int index, T element);

    void printElement(int index);

    void printAll();
}
