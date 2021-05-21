package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad2B {

    public final Pattern PATTERN = Pattern.compile("^\\d{2}-\\d{3}$");

    public Boolean isPostalCode(String string) {
        return PATTERN.matcher(string).matches();
    }
}
