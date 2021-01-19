package powtorka.switchtesty;

import java.util.Scanner;

public class DzienTygodniaSwitch {
    public static void main(String[] args) {

        int dzien;

        Scanner sc = new Scanner(System.in);

        System.out.println("program wyswietlajacy numery porzadkowe dni tygodnia" +
                " gdzie poniedzialek to 1 a niedziela 7");
        System.out.println("podaj numerek dnia tygodnia: ");

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("podaj jeszcze raz: ");
        }

        dzien = sc.nextInt();

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
                System.out.println("zly numerek, popraw sie");
        }
        sc.close();
    }
}
