//testy klasy String

package powtorka.stringtesty;

public class StringTesty {
    public static void main(String[] args) {

        String s1 = "To jest moj testowy string";
        System.out.println("To jest moj testowy string");

        System.out.println("dlugosc testowego stringa: " + s1.length() + " znakow");

        System.out.println("duze litery: " + s1.toUpperCase());
        System.out.println("male litery: " + s1.toLowerCase());

        System.out.println("pierwsze wystapienie \"moj\" na pozycji nr (zaczynamy od 0): " + s1.indexOf("moj"));

        System.out.println("czy moj string zawiera slowo \"jest\": " + s1.contains("jest"));
        System.out.println("znak na pozycji 7 to: " + s1.charAt(6));
        System.out.println("zamieniamy \"jest\" na \"byl\": " + s1.replace("jest", "byl"));
        System.out.println("pozycja ostatniego wystapienia znaku \"t\": " + s1.lastIndexOf("t"));
        System.out.println("zastapienie spacji znakiem \"-\": " + s1.replaceAll(" ", "-"));

        System.out.println("podzielenie stringa na wyrazy: \n");
        String[] tablicaStringow = s1.split(" ", 10);
        for (String s : tablicaStringow) {
            System.out.println(s);
        }
    }
}
