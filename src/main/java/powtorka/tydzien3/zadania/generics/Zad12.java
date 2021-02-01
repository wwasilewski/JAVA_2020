/*
Przygotuj program, który pobiera od użytkownika imiona i dodaje je do listy
generycznej typu String. Koniec wprowadzania imion następuje po wprowadzeniu
słowa “end”. Następnie program korzystając z pętli foreach wyświetla po kolei
wszystkie imiona podając na końcu każdego imienia ilość znaków z których się
składa (np. Jan (3))
*/

package powtorka.tydzien3.zadania.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad12 {
    Scanner sc = new Scanner(System.in);

    private List<String> listOfNames = new ArrayList<>();

    public void addNamesFromConsole() {
        String name;
        while (true) {
            System.out.println("provide a name (\"end\" will finish): ");
            name = sc.nextLine();
            if ("end".equals(name)) {
                break;
            } else {
                listOfNames.add(name);
            }
        }
        sc.close();
    }

    public void printAll() {
        for (String s : listOfNames) {
            System.out.println(s + "(" + s.length() + ")");
        }
    }
}
