package powtorka.tydzien2.zadania.oop.zad37;

public class Rectangle extends Figure {

    private float sideA, sideB;

    public Rectangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public float countArea() {
        return sideA * sideB;
    }

    @Override
    public void displayArea() {
        System.out.println("Figure: Rectangle, area: " + countArea());
    }
}
