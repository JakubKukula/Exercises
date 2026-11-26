package java_study.day23.animal.shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private final List<Animal> animalList;

    public Shelter(List<Animal> animalList) {
        this.animalList = new ArrayList<>(animalList);
    }

    public void walkAllDogs() {
        for (Animal animal : animalList) {
            if (animal instanceof Dog dog) {
                dog.walk();
            }
        }
    }

    public void allAnimalMakeSound() {
        for (Animal animal : animalList) {
            animal.makeSound();
        }
    }

    public double allCost() {
        double result = 0;
        for (Animal animal : animalList) {
            result += animal.dayleCost();
        }
        return result;
    }
}
