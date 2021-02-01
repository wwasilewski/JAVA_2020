package powtorka.tydzien3.zadania.generics.smartcontainer;

public class SmartContainerMain {
    public static void main(String[] args) {
        SmartContainer<String> stringSmartContainer = new SmartContainer<>();
        stringSmartContainer.addToList("this");
        stringSmartContainer.addToList("is");
        stringSmartContainer.addToList("my");
        stringSmartContainer.addToList("string");
        stringSmartContainer.printAll();
        stringSmartContainer.printElement(3);
        stringSmartContainer.updateElement(3, "newstring");
        stringSmartContainer.printElement(3);

        SmartContainer<Integer> integerSmartContainer = new SmartContainer<>();
        integerSmartContainer.addToList(1);
        integerSmartContainer.addToList(2);
        integerSmartContainer.addToList(3);
        integerSmartContainer.printAll();
        integerSmartContainer.printElement(2);
        integerSmartContainer.updateElement(2, 4);
        integerSmartContainer.printElement(2);
    }
}
