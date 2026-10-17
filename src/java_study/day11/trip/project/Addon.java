package java_study.day11.trip.project;

public enum Addon {

    BREAKFAST(50.0),
    DINNER(75.0),
    INSURANCE(100),
    ALL_INCLUSIVE(1000),
    GUIDE(500),
    TRANSFER(150);

    private final double price;

    Addon(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return price + "";
    }
}
