/*
Przygotuj aplikację, która pobiera od użytkownika ścieżkę do pliku i zapisuje w nim
tekst “<== Hello world ==>”
*/

package powtorka.tydzien4.io.zad1_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zad1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide a path to file: ");
        writeToFileWithPath(sc.nextLine());
        sc.close();
    }

    public static void writeToFileWithPath(String path) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(path));
            br.write("<== Hello world ==>");
            System.out.println("operation finished");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
