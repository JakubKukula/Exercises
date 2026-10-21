package java_study.day15;

public enum TemperatureUnit {

    CELSIUS {
        @Override
        public double toCelsius(double value) {
            return value;
        }
    },
    FAHRENHEIT {
        @Override
        public double toCelsius(double value) {
            return (value - 32) * 5.0 / 9;
        }
    },
    KELVIN {
        @Override
        public double toCelsius(double value) {
            return value - 273.15;
        }
    };

    public abstract double toCelsius(double value);
}
