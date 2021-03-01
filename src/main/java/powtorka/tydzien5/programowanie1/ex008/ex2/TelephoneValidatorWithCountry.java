/*
Rozbuduj aplikację z poprzedniego zadania tak aby mechanizm sprawdzający
weryfikował też numer kierunkowy kraju. Przykładowo numer telefonu +48505888159
jak i 505888159 jest poprawny.
*/

package powtorka.tydzien5.programowanie1.ex008.ex2;

import java.util.regex.Pattern;

public class TelephoneValidatorWithCountry {

    public boolean validate(String telephone) {
        Pattern pattern = Pattern.compile("" +
                "([+][0-9]{2})?[0-9]{9}|" +
                "([+][0-9]{2})?([0-9]{3}\s[0-9]{3}\s[0-9]{3})|" +
                "([+][0-9]{2})?([0-9]{3}-[0-9]{3}-[0-9]{3})");
        return pattern.matcher(telephone).matches();
    }
}
