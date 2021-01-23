package powtorka.tydzien1_zadania.wyjatki;

public class NullExceptionExample {
    public static void main(String[] args) {

        byte[] numbers = null;

        try {
            byte element = numbers[0];
        } catch (NullPointerException e) {
            System.out.println("Localized message: " + e.getLocalizedMessage());
            System.out.println("Stacktrace: ");
            e.printStackTrace();
        }
    }
}
