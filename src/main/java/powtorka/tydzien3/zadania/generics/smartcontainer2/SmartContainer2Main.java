package powtorka.tydzien3.zadania.generics.smartcontainer2;

public class SmartContainer2Main {
    public static void main(String[] args) {
        SmartContainer2<String> stringSC2 = new SmartContainer2<>();
        stringSC2.addToList("just");
        stringSC2.addToList("another");
        stringSC2.addToList("test");
        stringSC2.addToList("line");
        stringSC2.printAll();
        stringSC2.printElement(3);
        stringSC2.updateElement(3, "newline");
        stringSC2.printElement(3);

        SmartContainer2<Integer> integerSC2 = new SmartContainer2<>();
        integerSC2.addToList(1);
        integerSC2.addToList(2);
        integerSC2.addToList(3);
        integerSC2.printAll();
        integerSC2.printElement(2);
        integerSC2.updateElement(2, 4);
        integerSC2.printElement(2);
    }
}
