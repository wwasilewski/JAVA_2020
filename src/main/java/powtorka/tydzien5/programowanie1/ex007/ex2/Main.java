package powtorka.tydzien5.programowanie1.ex007.ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        List<Integer> numbersFromUser = ex2.getNumbersFromUser();
        for (Integer n : numbersFromUser) {
            System.out.println(n);
        }
    }
}
