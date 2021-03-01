/*
Napisz aplikację sprawdzającą czy wprowadzony przez użytkownika numer telefonu
jest poprawny. Przygotuj klasę o nazwie TelephoneValidator posiadającą
metodę
public boolean validate(String telephone);
Podany telefon uważa się za poprawny gdy składa się z 9 cyfr.
Poprawny numer telefonu to: 505879357, 505 879 357, 505-879-357
Błędny numer telefonu to: 50 58 79 35 7, 5058794, 44505879357
*/

package powtorka.tydzien5.programowanie1.ex008.ex1;

import java.util.regex.Pattern;

public class TelephoneValidator {

    public boolean validate(String telephone) {
        Pattern pattern = Pattern.compile("[0-9]{9}|([0-9]{3}\s[0-9]{3}\s[0-9]{3})|" +
                "([0-9]{3}-[0-9]{3}-[0-9]{3})");
        return pattern.matcher(telephone).matches();
    }
}
