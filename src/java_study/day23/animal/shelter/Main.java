package java_study.day23.animal.shelter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog rex = new Dog("Rex", 5, "Labrador");
        Dog azor = new Dog("Azor", 0, "Kundel");
        Cat mruczek = new Cat("Mruczek", 3);
        Parrot kiwi = new Parrot("Kiwi", 2);

        System.out.println(rex.dailyCost());              // 15.0
        System.out.println(azor.dailyCost());             // 10.0
        System.out.println(mruczek.dailyCost());          // 8.0
        System.out.println(kiwi.dailyCost());             // 5.0
        System.out.println(rex);                          // Rex 5 Lablador
        System.out.println(mruczek);                      // Mruczek 3

        Animal a = new Dog("Burek", 2, "Owczarek");
        System.out.println(a.dailyCost());                // 12.0   ← która wersja się wykona - tworzy obiekt dog
        a.makeSound();                                    // HAU HAU
       // a.walk();                                      //→ błąd   ← skompiluje się nie bo obiekt klasy a czyli Animal
        // nie ma walk() tylko klasa Dog

        List<Animal> animals = new ArrayList<>(List.of(rex, mruczek, kiwi, azor));
        Shelter shelter = new Shelter(animals);
        animals.add(new Dog("Intruz", 1, "Mops"));        // dodany PO utworzeniu schroniska
        shelter.allAnimalMakeSound();                     // 4   (ile linijek i jakie) rex , azor,mruczek,kiwi
        System.out.println(shelter.allCost());            // 38.0
        shelter.walkAllDogs();                            // rex, azor   (które imiona)

        System.out.println(new Shelter(new ArrayList<>()).allCost());   // 0.0

        // new Dog("", 3, "Mops");                        → wyjątek
        // new Cat("  ", 1);                              → wyjątek
        // new Animal("X", 1);                            //→ bład   ← skompiluje się nie ma podanej klasy

    }
}
