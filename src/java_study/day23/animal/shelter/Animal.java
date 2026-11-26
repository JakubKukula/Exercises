package java_study.day23.animal.shelter;

public abstract class Animal {

    private String name;
    private int age;
    private double costPerDay;

    public Animal(String name, int age, double costPerDay) {
        this.name = name;
        this.age = age;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public abstract double dayleCost();

    public abstract void makeSound();

}
