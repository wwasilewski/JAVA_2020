/*
Przygotuj aplikację, która zapisuje do pliku example.txt tekst “Hello world”.
*/

package powtorka.tydzien4.io.zad1_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Zad1_1 {
    public static void main(String[] args) {
        writeToFileUsingBufferedWriter();
    }

    public static void writeToFileUsingBufferedWriter() {
        try {
            BufferedWriter writer = new BufferedWriter
                    (new FileWriter("C:\\Users\\wwasi\\Desktop\\Java_2020\\logs\\example.txt"));
            writer.write("Hello World");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
