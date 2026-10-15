package java_study.day10.warm.up.task;

public class Main {
    static void main(String[] args) {

        new Order("A1", 120, Status.NEW);
        new Order("B2", 75, Status.PAID);
        new Order("C3", 200, Status.PAID);
        new Order("D4", 75, Status.NEW);
        new Order("E5", 50, Status.CANCELLED);
        new Order("F6", 75, Status.PAID);

        System.out.println(Order.averageAmount(Status.NEW));        // 97.5
        System.out.println(Order.averageAmount(Status.PAID));       // 116.66666666666667   ← dokładnie, z częścią po przecinku
        System.out.println(Order.averageAmount(Status.SHIPPED));    // 0.0
        System.out.println(Order.above(75));               // A1 120 NEW, C3 200 PAID
        System.out.println(Order.cheapestWithStatus(Status.PAID));  // B2 75 PAID   ← który kod i dlaczego bo zapisało pierwszy a nie ma niższego
        System.out.println(Order.cheapestWithStatus(Status.SHIPPED)); // wyjątek


    }
}
