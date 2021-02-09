/*
Przygotuj aplikację, która pobiera od użytkownika nazwę katalogu do utworzenia.
Program powinien utworzyć podany przez użytkownika katalog na dysku twardym.
*/

package powtorka.tydzien4.io.zad1_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Zad1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide directory's full path to create a directory: ");
        createDirectory(sc.nextLine());
        sc.close();
    }

    public static void createDirectory(String path) {
        Path directoryPath = Path.of(path);
        if (!Files.exists(directoryPath)) {
            try {
                Files.createDirectory(Path.of(path));
                System.out.println("directory created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("directory already exists");
        }
    }
}
