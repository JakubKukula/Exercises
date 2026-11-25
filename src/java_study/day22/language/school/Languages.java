package java_study.day22.language.school;

public enum Languages {
    ENGLISH(100.00),
    GERMAN(120.00),
    SPANISH(150.00);

    private final double prizePreMonth;

    Languages(double prizePreMonth) {
        this.prizePreMonth = prizePreMonth;
    }

    public double getPrizePreMonth() {
        return prizePreMonth;
    }
}
