//Class with some useful methods to avoid code duplication

package powtorka;

import java.util.Scanner;

public class Utils {

    public static void displayTextOnConsole(String text) {
        System.out.println(text);
    }

    public static void displayTextOnConsole(String text, String... args) {
        System.out.printf((text) + "%n", args);
    }

    public static void displayTextOnConsole(TextColor color, String text, String... args) {
        displayTextOnConsole(String.format(text, args), color);
    }

    public static void displayTextOnConsole(String text, Boolean newLine) {
        if (newLine) {
            System.out.println(text);
        } else {
            System.out.print(text);
        }
    }

    public static void displayTextOnConsole(String text, TextColor color) {
        System.out.printf("%s%s%s%n", color.getColor(), text, TextColor.ANSI_RESET.getColor());
    }

    public static void displayErrorOnConsole(String text) {
        displayTextOnConsole(text, TextColor.ANSI_RED);
    }

    public static void displayErrorOnConsole(String text, String... args) {
        displayTextOnConsole(String.format(text, args), TextColor.ANSI_RED);
    }

    public static String displayTextAndGetValue(String text, Boolean newLine) {
        Scanner sc = new Scanner(System.in);
        displayTextOnConsole(text, newLine);
        return sc.nextLine();
    }

    public static Integer displayTextAndGetInt(String text) {
        Scanner sc = new Scanner(System.in);
        displayTextOnConsole(text);
        return sc.nextInt();
    }
}
