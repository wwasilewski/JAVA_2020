//4. (*) Napisz program, który wypisze 30 liczb z ciągu Fibonacciego (1,1,2,3,5,8,13, ….)

package powtorka.tydzien1_zadania;

public class Fibbo {
    public static void main(String[] args) {

        int[] liczbyFibbo = new int[30];
        liczbyFibbo[0] = 1;
        liczbyFibbo[1] = 1;

        for (int i = 2; i < 30; i++) {
            liczbyFibbo[i] = liczbyFibbo[i - 1] + liczbyFibbo[i - 2];
        }

        for (int i = 0; i < 30; i++) {
            System.out.println(liczbyFibbo[i] + " - liczba nr " + (i + 1));
        }
    }
}
