package java_study.review;

public enum Fuel {
    PETROL(0.60),
    DIESEL(0.50),
    ELECTRIC(0.20);

    private final double pricePerKm;

    Fuel(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    // bo stała enuma jest niezmienna i porównując diesel == diesel da true

    public double getPricePerKm() {
        return pricePerKm;
    }
}
