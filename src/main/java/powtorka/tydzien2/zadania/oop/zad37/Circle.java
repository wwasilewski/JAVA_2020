package powtorka.tydzien2.zadania.oop.zad37;

public class Circle extends Figure {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float countArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public void displayArea() {
        System.out.println("Figure: Circle, area: " + countArea());

    }
}
