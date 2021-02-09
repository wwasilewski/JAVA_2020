/*
Przygotuj aplikację, która pobiera od użytkownika ścieżkę dowolnego pliku tekstowego,
wczytuje i wyświetla na konsoli jego zawartość. W celu realizacji zadania wykorzystaj
metodę readAllLines klasy Files.
*/

package powtorka.tydzien4.zad1_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Zad1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide a path to file: ");
        readAllLinesFromFile(sc.nextLine());
        sc.close();
    }

    public static void readAllLinesFromFile(String path) {
        Path file = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(file);
            for (String l : lines) {
                System.out.println(l);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
