package powtorka.tydzien2.zadania.oop.zad37;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int circlesInt, rectanglesInt, squaresInt;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("how many circles to draw?");
        while (!sc.hasNext("[0-9]+")) {
            System.out.println("pick again");
            sc.next();
        }
        circlesInt = sc.nextInt();

        System.out.println("how many rectangles to draw?");
        while (!sc.hasNext("[0-9]+")) {
            System.out.println("pick again");
            sc.next();
        }
        rectanglesInt = sc.nextInt();

        System.out.println("how many squares to draw?");
        while (!sc.hasNext("[0-9]+")) {
            System.out.println("pick again");
            sc.next();
        }
        squaresInt = sc.nextInt();

        List<Figure> figures = new ArrayList<>();

        for (int i = 0; i < circlesInt; i++) {
            int radius;
            radius = random.nextInt(10) + 1;
            Circle circle = new Circle(radius);
            figures.add(circle);
        }

        for (int i = 0; i < rectanglesInt; i++) {
            int sideA, sideB;
            sideA = random.nextInt(10) + 1;
            sideB = random.nextInt(10) + 1;
            Rectangle rectangle = new Rectangle(sideA, sideB);
            figures.add(rectangle);
        }

        for (int i = 0; i < squaresInt; i++) {
            int sideA;
            sideA = random.nextInt(10) + 1;
            Square square = new Square(sideA);
            figures.add(square);
        }

        for (Figure figure : figures) {
            figure.displayArea();
        }
        sc.close();
    }
}
