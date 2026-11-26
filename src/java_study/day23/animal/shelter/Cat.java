package java_study.day23.animal.shelter;

public class Cat extends Animal {

    public Cat(String name, int age, double costPerDay) {
        super(name, age, costPerDay);
    }

    @Override
    public double dayleCost() {
        return 8;
    }

    @Override
    public void makeSound() {
        System.out.println("MIAU");
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getCostPerDay();
    }
}
