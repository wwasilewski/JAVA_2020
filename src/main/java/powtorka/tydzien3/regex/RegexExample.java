package powtorka.tydzien3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // * - Occurs zero or more times, is short for {0,}
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches();
        System.out.println(b);

        String pattern = "[A-Z][a-z]{2}";
        String text = "Ala ma kota, a kot ma Ale";
        // *** ma kota , a kot ma ***
        System.out.println(text.replaceAll(pattern, "***"));

        String textToSplit = "Jan;Marian;Kowalski;Magazynowa;14;12";
        String splitPattern = ";";
        String[] splittedText = textToSplit.split(splitPattern);
        for (String s : splittedText) {
            System.out.print(s + " ");
        }

        pattern = ".*(\\d{9})";
        text = "Jan Kowalski 505666333";
        System.out.println("\n" + text.replaceAll(pattern, "$1"));
    }
}
