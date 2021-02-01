package powtorka.tydzien3.zadania.generics.smartcontainer2;

import java.util.ArrayList;
import java.util.List;

public class SmartContainer2<T> implements ContainerOperation<T> {
    private List<T> elements = new ArrayList<>();

    @Override
    public void addToList(T element) {
        elements.add(element);
    }

    @Override
    public T getFromList(int index) {
        return elements.get(index);
    }

    @Override
    public void updateElement(int index, T element) {
        elements.set(index, element);
    }

    @Override
    public void printElement(int index) {
        System.out.println("this is element no." + index + ": " + getFromList(index));
    }

    @Override
    public void printAll() {
        for (T e : elements) {
            System.out.println(e);
        }
    }
}
