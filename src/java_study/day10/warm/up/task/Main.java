package java_study.day10.warm.up.task;

public class Main {
    public static void main(String[] args) {

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

//        cheapestWithStatus(Status.PAID)
        /*
        metoda sprawdzając pierwszy obiekt nie nadpisuje result bo pierwszy warunek jest false
        2 iteracja status sie zgadza drugi warunk w if sprawdza czy result jest null jest więc nadpisana jest zmienna result
        3 iteracja status sie zgadza, null false , amount false cały warunek false
        4 iteracja status false
        5 iteracja stays false
        6 iteracja status true, null false i B2 ma równą wartość nie większą wiec drugi warunek falae
        result zostaje B2
         */


    }
}
