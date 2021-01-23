package powtorka.tydzien2.kolekcje.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterfaceExamples {
    public static void main(String[] args) {

        List<String> firstNames = new ArrayList<>();
        firstNames.add("Marta");
        firstNames.add("Kaska");
        firstNames.add("Wojtek");
        firstNames.add("Franek");
        System.out.println("My original list: " + firstNames);

        List<String> moreFirstNames = new ArrayList<>(Arrays.asList("Tomek", "Maria", "Andrzej", "Marta"));
        System.out.println("Another list with firstnames: " + moreFirstNames);

        firstNames.addAll(moreFirstNames);
        System.out.println("Two lists together: " + firstNames);

        System.out.println("Size of two lists together: " + firstNames.size());
        System.out.println("Is Wojtek on the list? " + firstNames.contains("Wojtek"));
        System.out.println("Wojtek's position on the list is: " + firstNames.indexOf("Wojtek"));
        System.out.println("Who is on the 3rd position? " + firstNames.get(3));

        firstNames.remove("Wojtek");
        firstNames.remove(5);
        System.out.println("List after removing Wojtek and index5 " + firstNames);
    }
}
