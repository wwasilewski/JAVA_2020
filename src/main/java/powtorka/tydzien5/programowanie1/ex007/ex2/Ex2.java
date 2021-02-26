/*
Przygotuj program pobierający liczby od użytkownika. Liczby powinna pobierać
odpowiednia klasa. Klasa powinna zawierać metodę getNumbersFromUser i powinna
mieć następującą sygnaturę List<Integer> getNumbersFromUser(). Liczby powinna
pobierać tak długo aż użytkownik wprowadzi literę “c”.
*/

package powtorka.tydzien5.programowanie1.ex007.ex2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class Ex2 {

    public List<Integer> getNumbersFromUser() {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("provide a number to add('c' ends the program): ");
            String input = sc.nextLine();

            if (input.equals("c")) {
                break;
            } else {
                Integer number = Integer.parseInt(input);
                numbers.add(number);
            }
        }
        return numbers;
    }
}
