package powtorka.tydzien1_zadania.wyjatki;

public class OutOfBoundsExceptionExample {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};

        try {
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
