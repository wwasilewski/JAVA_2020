/*
Jesteś osobą przetwarzająca zadania w kolejności w jakiej do Ciebie przyszły
(kolejka FIFO). Wykorzystaj do tego odpowiednią kolekcję. Dodaj 10 zadań, a
następnie pobierz je z kolekcji w takiej kolejności w jakiej zostały do niej dodane.
*/

package powtorka.tydzien5.programowanie1.ex001.collections.ex5;

import java.util.LinkedList;
import java.util.Queue;

public class Ex5 {
    public static void main(String[] args) {
        Queue<String> toDo = new LinkedList<>();
        while (toDo.size() < 10) {
            toDo.offer("task" + (toDo.size() + 1));
        }
        System.out.println(toDo);

        while (toDo.size() > 0) {
            System.out.println("task solved: " + toDo.poll());
            System.out.println("tasks left: " + toDo);
        }
    }
}
