package java_study.day15;

public class Enums {
    public static void main(String[] args) {

        // ===== Z1: Discount =====
        System.out.println(Discount.NONE.apply(100));      // 100.0
        System.out.println(Discount.STUDENT.apply(100));   // 80.0
        System.out.println(Discount.SENIOR.apply(100));    // 70.0
        System.out.println(Discount.VIP.apply(120));       // 70.0
        System.out.println(Discount.VIP.apply(30));        // 0.0   ← uwaga
        System.out.println();

        // ===== Z2: TrafficLight =====
        TrafficLight light = TrafficLight.RED;
        for (int i = 0; i < 4; i++) {
            light = light.next();
            System.out.println(light + " " + light.canGo());
        }
        // 1. GREEN     true
        // 2. YELLOW    false
        // 3. RED       false
        // 4. GREEN     true

        // ===== Z3: TemperatureUnit =====
        System.out.println(TemperatureUnit.CELSIUS.toCelsius(25));       // 25.0
        System.out.println(TemperatureUnit.FAHRENHEIT.toCelsius(212));   // 100.0
        System.out.println(TemperatureUnit.KELVIN.toCelsius(0));         // -273.15

        /*
        Z2 pytanie: co się stanie, gdy YELLOW zaimplementuje tylko next(), bez canGo()? → wyskonczy bła Implemented method
        Pytanie końcowe: dlaczego metoda abstrakcyjna jest lepsza niż switch (this)? → metoda abstarkcyjna jest lepsza bo
        dziła na konkretnej stałej(metodzie) a switch przechodzi po wszystkich case i przy kraku jakiegoś case wyrzyci
        wyjątek a abstrakcja sie nie skompiluje
        Kalkulator: Infinity czy wyjątek przy d2 == 0? Dlaczego? → to kwestia tego że nauczyciel nie kazał mi tego
        pisać chciaż chciałem zrbić walidację
        */


    }
}
