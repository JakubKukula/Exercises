package java_study.day20.enums;

public enum Shape {
    CIRCLE {
        @Override
        public double area(double a) {
            if (a <= 0) {
                throw new IllegalArgumentException("Number cannot be less than 0");
            }
            return (a * a) * 3.14159;
        }
    },
    SQUARE {
        @Override
        public double area(double a) {
            if (a <= 0) {
                throw new IllegalArgumentException("Number cannot be less than 0");
            }
            return a * a;
        }
    },
    TRIANGLE {
        @Override
        public double area(double a) {
            if (a <= 0) {
                throw new IllegalArgumentException("Number cannot be less than 0");
            }
            return (Math.sqrt(3) * a * a) / 4;
        }
    };

    public abstract double area(double a);

    public static Shape fromCode(char code) {
        if (code == 'C') {
            return Shape.CIRCLE;
        }
        if (code == 'S') {
            return Shape.SQUARE;
        }
        if (code == 'T') {
            return Shape.TRIANGLE;
        } else {
            throw new IllegalArgumentException("Wrong char");
        }
    }

    public static double largest(double a) {
        double[] values = {CIRCLE.area(a), SQUARE.area(a), TRIANGLE.area(a)};
        double result = 0;
        for (double value : values) {
            if (value > result) {
                result = value;
            }
        }
        return result;
    }
}
