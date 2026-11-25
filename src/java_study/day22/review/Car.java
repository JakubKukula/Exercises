package java_study.day22.review;

public class Car {

    private final String name; // nazwę auta nadaje sie raz
    private final Fuel fuel; // tak samo rodzij paliwa
    private static int count;

    public Car(String name, Fuel fuel) {
        this.name = name;
        this.fuel = fuel;
        count++;
    }

    public double tripCost(int km) { // nie static bo dotyka pola fuel z car
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

    @Override
    public String toString() {
        return name;
    }
}
