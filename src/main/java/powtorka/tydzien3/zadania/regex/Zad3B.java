package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad3B implements GeneralValidator {

    public final Pattern PATTERN = Pattern.compile("^[a-zA-Z0-9]{8,16}$");

    @Override
    public Boolean isValid(String string) {
        return PATTERN.matcher(string).matches();
    }
}
