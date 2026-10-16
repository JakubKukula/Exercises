package java_study.day10.diploma;

public enum GradeValue {
    A(6), B(5), C(4), D(3), E(2), F(1);

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
