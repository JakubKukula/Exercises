package java_study.day23.animal.shelter;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public double dailyCost() {
        return 8;
    }

    @Override
    public void makeSound() {
        System.out.println("MIAU");
    }
}
