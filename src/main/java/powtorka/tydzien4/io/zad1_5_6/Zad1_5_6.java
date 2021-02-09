/*
Przygotuj aplikację, która pobiera od użytkownika ścieżkę dowolnego pliku tekstowego,
wczytuje i wyświetla na konsoli jego zawartość. W celu realizacji zadania wykorzystaj
metodę newBufferedReader klasy Files.
Zmodyfikuj aplikację z poprzedniego zadania i do każdej wczytanej i wyświetlanej linii
dodaj jej numer porządkowy. Przykładowo jeśli linia zawiera tekst
“Drogi Marszałku, Wysoka Izbo. PKB rośnie.”
wyświetl ją jako
“1: Drogi Marszałku, Wysoka Izbo. PKB rośnie.“
*/

package powtorka.tydzien4.io.zad1_5_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Zad1_5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide a path to file: ");
        readAndPrintAllLinesFromFileWithBR(sc.nextLine());
        sc.close();
    }

    public static void readAndPrintAllLinesFromFileWithBR(String path) {
        try {
            BufferedReader br = Files.newBufferedReader(Path.of(path));
            String line;
            int counter = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(counter + ": " + line);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
