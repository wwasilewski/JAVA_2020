package powtorka.tydzien2.zadania.oop.car;

public class Engine {

    private double capacity, fuelConsumption;
    private int horsepower;

    public Engine(double capacity, double fuelConsumption, int horsepower) {
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
        this.horsepower = horsepower;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
