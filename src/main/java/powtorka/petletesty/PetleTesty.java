package powtorka.petletesty;

public class PetleTesty {
    public static void main(String[] args) {

//        petla while
        System.out.println("petla while: ");
        int i = 0;
        while (i < 8) {
            System.out.println(i);
            i++;
        }

//        petla do-while - bedzie wykonana zawsze chociaz 1 raz (a while moze byc 0)
        System.out.println("petla do-while: ");
        int j = 10;
        do {
            System.out.println(j);
            j--;
        }
        while (j > 0);

//        petla for
        System.out.println("petla for: ");
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }

        System.out.println("petla for od tylu: ");
        for (int l = 10; l > 0; l--) {
            System.out.println(l);
        }

//        petla for-each
        System.out.println("petla for-each");

        String[] imiona = {"Wojtek", "Maria", "Franek", "Kasia"};
        for (String s : imiona) {
            System.out.println(s);
        }

        int[] cyfry = {2, 3, 5, 1, 5, 9};
        for (int c : cyfry) {
            System.out.println(c);
        }
    }
}
