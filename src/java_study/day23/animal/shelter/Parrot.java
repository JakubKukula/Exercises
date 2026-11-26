package java_study.day23.animal.shelter;

public class Parrot extends Animal {

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("KRA KRA");
    }

    @Override
    public double dailyCost() {
        return 5;
    }
}
