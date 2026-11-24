package java_study.review;

public enum Fuel {
    PETROL(0.60),
    DIESEL(0.50),
    ELECTRIC(0.20);

    private final double pricePerKm;

    Fuel(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }
}
