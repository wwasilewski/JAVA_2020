package powtorka.tydzien5.programowanie1.ex010.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        points.add(new Point(4, 2));
        points.add(new Point(1, 2));
        points.add(new Point(3, 1));
        points.add(new Point(2, 2));
        points.add(new Point(5, 4));
        points.add(new Point(8, 2));
        points.add(new Point(7, 3));
        points.add(new Point(9, 2));
        points.add(new Point(10, 2));
        points.add(new Point(11, 2));

        points.stream()
                .sorted(Comparator.comparing(Point::getX))
                .forEach(System.out::println);
    }
}
