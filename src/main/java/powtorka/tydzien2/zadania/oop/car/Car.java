package powtorka.tydzien2.zadania.oop.car;

public abstract class Car {

    String producer, model, color;
    int seatsNumber;
    Engine engine;

    public Car() {
        this.seatsNumber = 2;
    }

    public Car(String producer, String model, String color, int seatsNumber, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }
}
