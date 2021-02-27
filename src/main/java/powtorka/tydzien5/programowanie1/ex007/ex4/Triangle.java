package powtorka.tydzien5.programowanie1.ex007.ex4;

public class Triangle extends Figure {
    private static final String Type = "Triangle";
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double countPerimeter() {
        double hypotenuse = Math.pow(Math.pow(base, 2) + Math.pow(height, 2), 0.5);
        return base + height + hypotenuse;
    }

    @Override
    public double countSurface() {
        return 0.5 * base * height;
    }

    @Override
    public void getDetailedInfo() {
        System.out.println("Type: " + Type + ", base: " + base + ", height " + height +
                ", perimeter: " + countPerimeter() + ", surface: " + countSurface());
    }
}
