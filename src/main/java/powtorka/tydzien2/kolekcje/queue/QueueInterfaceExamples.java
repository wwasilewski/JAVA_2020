package powtorka.tydzien2.kolekcje.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceExamples {
    public static void main(String[] args) {

        Queue<String> names = new PriorityQueue<>();
        names.add("Marta");
        names.add("Wojtek");
        names.add("Tomek");
        names.add("Bonzo");
        names.add("Ania");
        System.out.println("My PriorityQueue: " + names);
        System.out.println("Size of the queue: " + names.size());

        String removed = names.remove();
        System.out.println("Removing 1st element: " + removed);
        System.out.println("Queue after removing 1st element: " + names);

        removed = names.remove();
        System.out.println("Removing 2nd element: " + removed);
        System.out.println("Queue after removing 2nd element: " + names);
        System.out.println("Size of the queue after changes: " + names.size());
    }
}
