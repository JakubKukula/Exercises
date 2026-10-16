package java_study.day10.diploma;

public enum GradeValue {
    CELUJACY(6), BARDZO_DOBRY(5), DOBRY(4), DOSTATECZNY(3), DOPUSZCZAJACY(2), NIEDOSTATECZNY(1);

    private final int value;

    GradeValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
