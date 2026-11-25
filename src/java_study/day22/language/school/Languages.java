package java_study.day22.language.school;

public enum Languages {
    ENGLISH(100.00),
    GERMAN(120.00),
    SPANISH(150.00);

    private final double pricePreMonth;

    Languages(double prizePreMonth) {
        this.pricePreMonth = prizePreMonth;
    }

    public double getPricePreMonth() {
        return pricePreMonth;
    }
}
