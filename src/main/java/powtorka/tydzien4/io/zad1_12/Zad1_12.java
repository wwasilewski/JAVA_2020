/*
Przygotuj aplikację, która generuje dane osobowe.
1.12.1. Przygotuj plik im_meske.txt - plik zawiera listę męskich imion. Każde imię
powinno znajdować się w osobnej linii.
1.12.2. Przygotuj plik nazwiska_zenskie.txt - plik zawiera listę żeńskich nazwisk. Każde
nazwisko powinno znajdować się w nowej linii.
1.12.3. Przygotuj plik nazwiska_meskie.txt - plik zawiera listę męskich nazwisk. Każde
nazwisko powinno znajdować się w nowej linii.
1.12.4. Przygotuj plik im_zenskie.txt - plik zawiera listę żeńskich imion. Każde imię
powinno znajdować się w osobnej linii.
1.12.5. Przygotuj plik miejscowosci.txt - plik zawiera listę polskich miejscowości. Każda
miejsowość powinna znajdować się w osobnej linii.
1.12.6. Przygotuj plik ulice.txt - plik zawiera listę nazw ulic dowolnej miejscowości.
Każda nazwa ulica powinna znajdować się w osobnej linii.
1.12.7. Przygotuj aplikację, która wczytuje wszystkie pliki (lokalizacja może być
ustalona) do dowolnej struktury (tablica, kolekcja)
1.12.8. Aplikacja pyta użytkownika o ilość wygenerowanych danych personalnych.
1.12.9. Aplikacja generuje i zapisuje do pliku dane w następującym formacie
<imie>;<nazwisko>;<ulica>;<nr_mieszk>;<nr_domu>;<miejscowość>;<nr_tel>
Przykładowo
Jan;Kowalski;Kamienna;55a;3;Bydgoszcz;+48505828456
*/

package powtorka.tydzien4.io.zad1_12;

import powtorka.Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Zad1_12 {
    public static void main(String[] args) {
        readAllLinesFromFile("male_firstnames.txt");
        readAllLinesFromFile("male_surnames.txt");
        readAllLinesFromFile("street.txt");
        readAllLinesFromFile("location.txt");
        readAllLinesFromFile("phone_number.txt");

        String howManyRecords = Utils.displayTextAndGetValue("how many records?", true);
        generateNamesRecords(Integer.parseInt(howManyRecords));
    }

    public static List<String> readAllLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        Path filePath = Paths.get("C:\\Users\\wwasi\\Desktop\\JAVA_2020\\src\\main\\java" +
                "\\powtorka\\tydzien4\\io\\zad1_12\\" + fileName);
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void generateNamesRecords(int numberOfRecords) {
        try {
            if (numberOfRecords - 1 < readAllLinesFromFile("male_firstnames.txt").size()) {
                BufferedWriter bw = new BufferedWriter
                        (new FileWriter("C:\\Users\\wwasi\\Desktop\\JAVA_2020\\logs\\data.txt"));
                for (int i = 0; i < numberOfRecords; i++) {
                    bw.write(readAllLinesFromFile("male_firstnames.txt").get(i) +
                            ";" + readAllLinesFromFile("male_surnames.txt").get(i) +
                            ";" + readAllLinesFromFile("street.txt").get(i) +
                            ";" + readAllLinesFromFile("location.txt").get(i) +
                            ";" + readAllLinesFromFile("phone_number.txt").get(i));
                    bw.write(System.lineSeparator());
                }
                bw.close();
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
