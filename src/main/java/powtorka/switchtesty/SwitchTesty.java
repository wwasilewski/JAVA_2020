package powtorka.switchtesty;

public class SwitchTesty {
    public static void main(String[] args) {

//        stary switch
        int dzien = 4;

        switch (dzien) {
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piatek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
            default:
                System.out.println("cos porypales z numerem dnia");
        }

//        nowy switch w ktorym nie trzeba break'a (od javy 13)

        switch (dzien) {
            case 1, 8 -> System.out.println("poniedzialek");
            case 2, 9 -> System.out.println("wtorek");
            case 3, 10 -> System.out.println("sroda");
            case 4, 11 -> System.out.println("czwartek");
            case 5, 12 -> System.out.println("piatek");
            case 6, 13 -> System.out.println("sobota");
            case 7, 14 -> System.out.println("niedziela");
            default -> System.out.println("podales niepoprawny numer dnia");
        }
    }
}
