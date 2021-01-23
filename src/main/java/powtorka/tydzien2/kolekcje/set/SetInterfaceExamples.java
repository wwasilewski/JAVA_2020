package powtorka.tydzien2.kolekcje.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceExamples {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(9);
        numbers.add(9);
        System.out.println("Set of numbers(duplicates not allowed): " + numbers);

        Set<Integer> moreNumbers = new HashSet<>();
        moreNumbers.add(11);
        moreNumbers.add(2);
        moreNumbers.add(4);
        moreNumbers.add(31);
        moreNumbers.add(5);
        moreNumbers.add(4);
        moreNumbers.add(null);

        System.out.println("Second set of numbers: " + moreNumbers);

        numbers.addAll(moreNumbers);
        System.out.println("Two sets together (duplicates not allowed): " + numbers);

        System.out.println("Is my set empty? " + numbers.isEmpty());
        System.out.println("Set's size: " + numbers.size());
        System.out.println("Is number 5 in my set? " + numbers.contains(5));

        numbers.remove(11);
        System.out.println("Set after removing number 11: " + numbers);

        Set<String> firstNames = new LinkedHashSet<>();
        firstNames.add("Wojtek");
        firstNames.add("Tomek");
        firstNames.add("Ania");
        firstNames.add("Janek");
        firstNames.add("Magda");
        System.out.println("LinkedHashSet (maintains the insertion order): " + firstNames);
    }
}
