package java_study.day15;

public enum Discount {
    NONE {
        @Override
        public double apply(double price) {
            return price;
        }
    },
    STUDENT {
        @Override
        public double apply(double price) {
            return price * (1 - 20.0 / 100);
        }
    },
    SENIOR {
        @Override
        public double apply(double price) {
            return price * (1 - 30.0 / 100);
        }
    },
    VIP {
        @Override
        public double apply(double price) {
            return price - 50 > 0 ? price - 50 : 0;
        }
    };

    public abstract double apply(double price);
}
