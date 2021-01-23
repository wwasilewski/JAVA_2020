package powtorka.tydzien2.kolekcje.map;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExamples {
    public static void main(String[] args) {

        Map<Integer, String> clients = new HashMap<>();

        clients.put(1, "Wojtek W");
        clients.put(2, "Kaska M");
        clients.put(3, "Marek C");
        clients.put(4, "Bob W");
        clients.put(5, "Marta G");
        System.out.println("Clients: " + clients);

        for (Map.Entry<Integer, String> entry : clients.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " client: " + entry.getValue());
        }

        System.out.println("Changing client's name from \"Kaska M\" to \"Katarzyna M\": ");
        clients.replace(2, "Katarzyna M");
        System.out.println("New clients list: " + clients);
        System.out.println("Is Marek C on the list? " + clients.containsValue("Marek C"));
        System.out.println("Removing \"Bob W\" from the list");
        clients.remove(4);
        System.out.println("Actual list: " + clients);
    }
}
