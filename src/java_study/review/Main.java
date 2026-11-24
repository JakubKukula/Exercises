package java_study.review;

public class Main {
    public static void main(String[] args) {

        Car a = new Car("Golf", Fuel.DIESEL);
        Car b = new Car("Tesla", Fuel.ELECTRIC);
        System.out.println(a.tripCost(100));   // 50
        System.out.println(b.tripCost(50));    // 10
        System.out.println(Car.count);         // 2
        System.out.println(b.fuel.ordinal());  // 2
    }
}
