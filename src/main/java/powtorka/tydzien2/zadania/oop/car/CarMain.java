package powtorka.tydzien2.zadania.oop.car;

public class CarMain {
    public static void main(String[] args) {

        Car car = new SportCar("mercedes", "slk", "black",
                3, new Engine(6000d, 25d, 650));
        System.out.println("car: " + car.producer + " " + car.model + ", horsepower: "
                + car.engine.getHorsepower());
    }
}
