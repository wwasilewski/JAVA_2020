/*
Przygotuj aplikację kopiującą plik z jednej lokalizacji do innej. Program prosi
użytkownika o wprowadzenie nazwy (ścieżki) pliku do skopiowania oraz nazwy
(ścieżki) do które plik ma zostać skopiowany.
Zmodyfikuj plik z poprzedniego zadania tak aby program po skopiowaniu pliku
wyświetlał komunikat “Czy chcesz usunąć plik źródłowy [t/n]?”
Jeśli użytkownik wprowadzi znak t to program usuwa plik, źródłowy.
Jeśli użytkownik wprowadzi znak n to program pozostawia plik źródłowy.
*/

package powtorka.tydzien4.io.zad1_10;

import powtorka.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zad1_10 {
    public static void main(String[] args) {
        String fileToCopy = Utils.displayTextAndGetValue("provide file's path: ", true);
        String copiedFile = Utils.displayTextAndGetValue("provide destination's path: ", true);
        copyFileFromSourceToDestinationWithDelete(fileToCopy, copiedFile);
    }

    public static void copyFileFromSourceToDestinationWithDelete(String source, String destination) {
        Path fromPath = Paths.get(source);
        Path toPath = Paths.get(destination);
        try {
            Files.copy(fromPath, toPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (Files.exists(fromPath)) {
            String deleteOrNot = Utils.displayTextAndGetValue("delete source? y/n", true);
            if (deleteOrNot.equals("y")) {
                try {
                    Files.delete(fromPath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
