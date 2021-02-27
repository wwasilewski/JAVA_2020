package powtorka.tydzien5.programowanie1.ex007.ex4;

public class Main {
    public static void main(String[] args) {

        Figure square = new Square(3);
        square.getDetailedInfo();
        Figure circle = new Circle(2);
        circle.getDetailedInfo();
        Figure rectangle = new Rectangle(3, 4);
        rectangle.getDetailedInfo();
        Figure triangle = new Triangle(5, 3);
        triangle.getDetailedInfo();
    }
}
