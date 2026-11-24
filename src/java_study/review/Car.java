package java_study.review;

public class Car {

    private String name;
    final Fuel fuel;
    static int count;

    public Car(String name, Fuel fuel) {
        this.name = name;
        this.fuel = fuel;
        count++;
    }

    public double tripCost(int km) {
        return km * fuel.getPricePerKm();
    }

    public String getName() {
        return name;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public int getCount() {
        return count;
    }
}
