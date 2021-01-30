/*
Numer seryjny oprogramowania ma postać "CFG&Y-TYH67-GH56T-UIO99-RY4RT",
gdzie każdy blok może składać się z dużych liter lub cyfr. Bloki oddzielone są
myślnikami "-". W numerze występuje dokładnie 5 bloków z wartościami. Przygotuj
wyrażenie regularne sprawdzające numer seryjny.
*/

package powtorka.tydzien3.zadania.regex;

import java.util.regex.Pattern;

public class Zad7 {
    public Boolean checkForSerialLicense(String text) {
        Pattern pattern = Pattern.compile("^[A-Z0-9]{5}-[A-Z0-9]{5}-[A-Z0-9]{5}-[A-Z0-9]{5}-[A-Z0-9]{5}$");
        return pattern.matcher(text).matches();
    }
}
