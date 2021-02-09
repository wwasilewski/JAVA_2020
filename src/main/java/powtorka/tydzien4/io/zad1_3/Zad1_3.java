/*
Przygotuj aplikację, która wczytuje i wyświetla zawartość pliku example.txt
*/

package powtorka.tydzien4.io.zad1_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Zad1_3 {
    public static void main(String[] args) {
        try {
            readAndPrintAllLinesUsingBufferedReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndPrintAllLinesUsingBufferedReader() throws IOException {
        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("C:\\Users\\wwasi\\Desktop\\JAVA_2020\\logs\\example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
