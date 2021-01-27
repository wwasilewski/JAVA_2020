package powtorka.tydzien2.zadania.oop.zad37;

public class Square extends Figure {

    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float countArea() {
        return side * side;
    }

    @Override
    public void displayArea() {
        System.out.println("Figure: Square, area: " + countArea());
    }
}
