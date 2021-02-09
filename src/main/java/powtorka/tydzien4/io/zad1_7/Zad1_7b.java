/*
Przygotuj aplikację, która pobiera od użytkownika nazwę katalogu do utworzenia.
Program powinien utworzyć podany przez użytkownika katalog w zdefinowanym katalogu
C:\Users\wwasi\Desktop\JAVA_2020\logs.
*/

package powtorka.tydzien4.io.zad1_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Zad1_7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide directory's name to create in" +
                " C:\\Users\\wwasi\\Desktop\\JAVA_2020\\logs");
        createDirectoryInSpecifiedPath(sc.nextLine());
        sc.close();
    }

    public static void createDirectoryInSpecifiedPath(String dirName) {
        String specifiedPath = "C:\\Users\\wwasi\\Desktop\\JAVA_2020\\logs\\";
        Path path = Path.of(specifiedPath + dirName);
        if (!Files.exists(path)) {
            try {
                Files.createDirectory(path);
                System.out.println("directory created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("directory already exists");
        }
    }
}
