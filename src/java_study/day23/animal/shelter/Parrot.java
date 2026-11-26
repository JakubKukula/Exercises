package java_study.day23.animal.shelter;

public class Parrot extends Animal {

    public Parrot(String name, int age, double costPerDay) {
        super(name, age, costPerDay);
    }

    @Override
    public void makeSound() {
        System.out.println("KRA KRA");
    }

    @Override
    public double dayleCost() {
        return 5;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getCostPerDay();
    }
}
