/*
Przygotuj aplikację, która pobiera od użytkownika ścieżkę do katalogu a następnie
wyświetla ilość plików we wprowadzonym katalogu.
*/

package powtorka.tydzien4.io.zad1_8;

import java.io.File;
import java.util.Scanner;

public class Zad1_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide path to directory: ");
        printNumberOfFilesInDirectory(sc.nextLine());
        sc.close();
    }

    public static void printNumberOfFilesInDirectory(String path) {
        File file = new File(path);
        try {
            File[] files = file.listFiles(f -> f.isFile());
            System.out.println(files.length);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
