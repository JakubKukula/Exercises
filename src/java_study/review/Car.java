package java_study.review;

public class Car {

    private String name;
    private final Fuel fuel;
    private static int count;

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

    public static int getCount() {
        return count;
    }
}
