package powtorka.tydzien5.programowanie1.ex007.ex4;

public class Circle extends Figure {
    private static final String TYPE = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double countPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double countSurface() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDetailedInfo() {
        System.out.println("Type: " + TYPE + ", radius: " + radius + ", perimeter: " + countPerimeter()
                + ", surface: " + countSurface());
    }
}
