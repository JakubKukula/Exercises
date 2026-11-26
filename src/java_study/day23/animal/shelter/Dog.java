package java_study.day23.animal.shelter;

public class Dog extends Animal {

    private String fetch;

    public Dog(String name, int age, double costPerDay, String fetch) {
        super(name, age, costPerDay);
        this.fetch = fetch;
    }

    public void walk(){
        System.out.println(getName() + " walk");
    }

    public String getFetch() {
        return fetch;
    }

    @Override
    public double dayleCost() {
        return 10 + getAge();
    }

    @Override
    public void makeSound() {
        System.out.println("HAU HAU");
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getCostPerDay() + " " + fetch;
    }
}
