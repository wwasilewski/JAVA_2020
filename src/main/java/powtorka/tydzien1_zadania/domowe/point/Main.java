/*
1. Utwórz klasę punkt, posiadającą pola publiczne: double x, double y. Utwórz dwa obiekty tej klasy w funkcji main
 	    i wyświetl ich zawartość.
2. Dodaj do klasy punkt gettery (accessor) i settery (mutuator) oraz metodę double distance(Point other),
 	    obliczającą odległość euklidesową. Wzór: sqrt((x1-x2)^2 + (y1-y2)^2)
*/

package powtorka.tydzien1_zadania.domowe.point;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(0, 0);
        Point point2 = new Point(4, 4);
        Point point3 = new Point(2, 4);
        Point point4 = new Point(6, 8);

        System.out.println("Euclidean distance points 1-2: " + point1.distance(point2));
        System.out.println("Euclidean distance points 2-4: " + point2.distance(point4));
        System.out.println("Euclidean distance points 1-3: " + point1.distance(point3));
        System.out.println("Euclidean distance points 1-4: " + point1.distance(point4));
    }
}
