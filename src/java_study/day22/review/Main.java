package java_study.day22.review;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Car a = new Car("Golf", Fuel.DIESEL);
//        Car b = new Car("Tesla", Fuel.ELECTRIC);
//        System.out.println(a.tripCost(100));   // 50.0
//        System.out.println(b.tripCost(50));    // 10.0
//        System.out.println(Car.getCount());         // 2
//        System.out.println(b.getFuel().ordinal());  // 2

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Golf", Fuel.DIESEL));
        cars.add(new Car("Tesla", Fuel.ELECTRIC));
        cars.add(new Car("Passat", Fuel.DIESEL));
        cars.add(new Car("Fiat", Fuel.PETROL));

        Fleet fleet = new Fleet(cars);

        /*
        car     paliwo      istnieje       tworzy nową liste    lista           mapa
        golf    diesel         nie                 tak           golt           diesel
        tesla   electric        nie                 tak         tesla           electric
        passta  siesel          tak                 nie         golf passat     diesel
        fiat    petrol          nie                 tak         fiat            petrol

         */

        System.out.println(fleet.groupByFuel().get(Fuel.DIESEL));            // golf passat
        System.out.println(fleet.groupByFuel().get(Fuel.ELECTRIC));          // tesla
        System.out.println(fleet.groupByFuel().containsKey(Fuel.PETROL));    // true
        System.out.println(fleet.groupByFuel().size());                      // 3

        List<Car> dieselOnly = new ArrayList<>();

        Fleet fleetDiesel = new Fleet(dieselOnly);
        dieselOnly.add(new Car("Octavia", Fuel.DIESEL));

        System.out.println(fleetDiesel.groupByFuel().containsKey(Fuel.PETROL));   // false
        System.out.println(fleetDiesel.groupByFuel().size());              // 0

        Fleet emptyFleet = new Fleet(new ArrayList<>());

        System.out.println(fleet.cheapestFuelUsed());                // electric
        System.out.println(fleetDiesel.cheapestFuelUsed());          // diesel
        System.out.println(emptyFleet.cheapestFuelUsed());   //  null

        System.out.println(fleet.allCost(10));                   // 18.0
        System.out.println(emptyFleet.allCost(10));      // 0.0

        List<Car> outside = new ArrayList<>();
        Fleet protectedFleet = new Fleet(outside);
        outside.add(new Car("Yaris", Fuel.PETROL));                       // dodane PO utworzeniu floty
        System.out.println(protectedFleet.getCars().size());              // 0
        protectedFleet.getCars().add(new Car("Clio", Fuel.PETROL));       // dodane do KOPII z gettera
        System.out.println(protectedFleet.getCars().size());              // 0
    }
}
