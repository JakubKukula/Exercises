package java_study.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Fleet {

    private final List<Car> cars;

    public Fleet(List<Car> cars) {
        this.cars = cars;
    }

    public Map<Fuel, List<Car>> groupByFuel() {
        Map<Fuel, List<Car>> result = new TreeMap<>();
        for (Car car : cars) {
            Fuel fuel = car.getFuel();
            if (!result.containsKey(fuel)) {
                List<Car> carList = new ArrayList<>();
                result.put(fuel, carList);
            }
            result.get(fuel).add(car);
        }
        return result;
    }

    public Fuel chappestFuelUsed() {
        if (cars.isEmpty()) {
            return null;
        }
        Fuel result = cars.getFirst().getFuel();
        for (Car car : cars) {
            if (car.getFuel().getPricePerKm() < result.getPricePerKm()) {
                result = car.getFuel();
            }
        }
        return result;
    }

    public double allCost(int km) {
        double result = 0.0;
        for (Car car : cars) {
            double costFuelByKm = car.getFuel().getPricePerKm();
            result += costFuelByKm * km;
        }
        return result;
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return cars + "";
    }
}
