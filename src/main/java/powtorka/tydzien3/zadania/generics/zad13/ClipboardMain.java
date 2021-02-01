package powtorka.tydzien3.zadania.generics.zad13;

public class ClipboardMain {
    public static void main(String[] args) {
        Clipboard<String> clipboard = new Clipboard<>();
        clipboard.insertIntoClipboard("this is a string");
        System.out.println(clipboard.getFromClipboard());

        Clipboard<Integer> integerClipboard = new Clipboard<>();
        integerClipboard.insertIntoClipboard(3);
        System.out.println(integerClipboard.getFromClipboard());
    }
}
