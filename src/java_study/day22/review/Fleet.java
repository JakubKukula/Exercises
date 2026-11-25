package java_study.day22.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Fleet {

    private final List<Car> cars;

    public Fleet(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
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

    public Fuel cheapestFuelUsed() {
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
            result += car.tripCost(km);
        }
        return result;
    }

    // metody nie mogą byc static bo używają pola fleet

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public String toString() {
        return cars + "";
    }
}
