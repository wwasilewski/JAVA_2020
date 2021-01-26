/*
1. Utwórz klasę punkt, posiadającą pola publiczne: double x, double y. Utwórz dwa obiekty tej klasy w funkcji main
        i wyświetl ich zawartość.
2. Dodaj do klasy punkt gettery (accessor) i settery (mutuator) oraz metodę double distance(Point other),
        obliczającą odległość euklidesową. Wzór: sqrt((x1-x2)^2 + (y1-y2)^2)
*/

package powtorka.tydzien1_zadania.domowe.point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point other) {
        double x1 = this.x;
        double y1 = this.y;

        double x2 = other.getX();
        double y2 = other.getY();

        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }
}
