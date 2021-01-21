package powtorka.switchtesty;

import java.util.Scanner;

public class DayOfTheWeekUsingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("pick a number [1-7] to match a day of the week: ");

        while (!sc.hasNext("[1-7]")) {
            System.out.println("wrong pick, use [1-7]: ");
            sc.next();
        }

        String pickedDay = sc.next();
        switch (pickedDay) {
            case "1" -> System.out.println("monday");
            case "2" -> System.out.println("tuesday");
            case "3" -> System.out.println("wednesday");
            case "4" -> System.out.println("thursday");
            case "5" -> System.out.println("friday");
            case "6" -> System.out.println("saturday");
            case "7" -> System.out.println("sunday");
        }
        sc.close();
    }
}
