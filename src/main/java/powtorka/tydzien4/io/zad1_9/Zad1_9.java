/*
Przygotuj aplikację kopiującą plik z jednej lokalizacji do innej. Program prosi
użytkownika o wprowadzenie nazwy (ścieżki) pliku do skopiowania oraz nazwy
(ścieżki) do której plik ma zostać skopiowany.
*/

package powtorka.tydzien4.io.zad1_9;

import powtorka.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zad1_9 {
    public static void main(String[] args) {
        String fromPath = Utils.displayTextAndGetValue("provide file's path location: ", true);
        String toPath = Utils.displayTextAndGetValue("provide destination's path: ", true);
        copyFileFromSourceToDestination(fromPath, toPath);
    }

    public static void copyFileFromSourceToDestination(String fromPath, String toPath) {
        Path source = Paths.get(fromPath);
        Path destination = Paths.get(toPath);
        try {
            Files.copy(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
