package powtorka.tydzien5.programowanie1.ex007.ex4;

public class Square extends Figure {
    private static final String TYPE = "Square";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double countPerimeter() {
        return 4 * side;
    }

    @Override
    public double countSurface() {
        return side * side;
    }

    @Override
    public void getDetailedInfo() {
        System.out.println("Type: " + TYPE + ", side: " + side + ", perimeter: " + countPerimeter()
                + ", surface: " + countSurface());
    }
}
