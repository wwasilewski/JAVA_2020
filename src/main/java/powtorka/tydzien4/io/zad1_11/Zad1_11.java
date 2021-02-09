/*
Przygotuj aplikację, która pobiera od użytkownika nazwę pliku do usunięcia. Po
wprowadzeniu nazwy pliku, program sprawdza czy dany plik istnieje. Jeśli plik nie
istnieje to program wyświetla komunikat “Wprowadzony plik nie istnieje”.
Jeśli plik istnieje to program wyświetla pytanie
“Czy chcesz usunąć plik <nazwa_pliku> [t/n]?”
Wprowadzenie litery t powoduje usunięcie pliku, litery n anulowanie usuwania, a
dowolnego innego znaku wypisanie komunikatu
“Nieprawidłowy wybór” oraz powtórzenie pytania.
*/

package powtorka.tydzien4.io.zad1_11;

import powtorka.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zad1_11 {
    public static void main(String[] args) {
        String fileToDelete = Utils.displayTextAndGetValue("provide file's path: ", true);
        deleteFileFromPath(fileToDelete);
    }

    public static void deleteFileFromPath(String path) {
        Path filePath = Paths.get(path);
        if (!Files.exists(filePath)) {
            System.out.println("file doesn't exist");
        } else {
            while (true) {
                String fileToDelete = Utils.displayTextAndGetValue("delete the file? y/n", true);
                if (fileToDelete.equals("y")) {
                    try {
                        Files.delete(filePath);
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fileToDelete.equals("n")) {
                    break;
                }
            }
        }
    }
}
