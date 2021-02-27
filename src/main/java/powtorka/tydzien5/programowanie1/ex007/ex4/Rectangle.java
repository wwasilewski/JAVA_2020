package powtorka.tydzien5.programowanie1.ex007.ex4;

public class Rectangle extends Figure {
    private static final String TYPE = "Rectangle";
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double countPerimeter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public double countSurface() {
        return sideA * sideB;
    }

    @Override
    public void getDetailedInfo() {
        System.out.println("Type: " + TYPE + ", sideA: " + sideA + ", sideB: " + sideB +
                ", perimeter: " + countPerimeter() + ", surface: " + countSurface());
    }
}
