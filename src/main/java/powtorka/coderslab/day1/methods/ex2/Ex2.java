/*
Napisz metodę `static int multiply(int multipler, int index)`,
która zwróci wartość zmiennej `multipler` pomnożoną przez wartość argumentu `index`.
*/

package powtorka.coderslab.day1.methods.ex2;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(multiply(3, 4));

    }

    public static int multiply(int multipler, int index) {
        return multipler * index;
    }
}
