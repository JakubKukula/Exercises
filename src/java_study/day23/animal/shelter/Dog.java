package java_study.day23.animal.shelter;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String fetch) {
        super(name, age);
        this.breed = fetch;
    }

    public void walk(){
        System.out.println(getName() + " walk");
    }
    // bo tylko psa sie wyprowadza na spacer i tak też mówiło polecenie zadania

    public String getBreed() {
        return breed;
    }

    @Override
    public double dailyCost() {
        return 10 + getAge();
    }

    @Override
    public void makeSound() {
        System.out.println("HAU HAU");
    }

    @Override
    public String toString() {
        return super.toString() + " " + breed;
    }
}
