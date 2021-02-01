package powtorka.tydzien3.zadania.generics.smartcontainer;

import java.util.ArrayList;
import java.util.List;

public class SmartContainer<T> {
    private List<T> elements = new ArrayList<>();

    public void addToList(T element) {
        elements.add(element);
    }

    public T getFromList(int index) {
        return elements.get(index);
    }

    public void updateElement(int index, T element) {
        elements.set(index, element);
    }

    public void printElement(int index) {
        System.out.println("this is element no." + index + ": " + getFromList(index));
    }

    public void printAll() {
        for (T e : elements) {
            System.out.println(e);
        }
    }
}
