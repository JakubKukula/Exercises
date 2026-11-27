package java_study.day23.animal.shelter;

public abstract class Animal { // żeby inne klasy mogły dziedziczyć pola jak i metody z tej klasy i nie pisać w każdej
    // klasie pól name czy age

    private String name;
    private int age;

    public Animal(String name, int age) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        if (age < 0){
            throw new IllegalArgumentException("Age cannot be less than 0");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double dailyCost();

    public abstract void makeSound();

    // te dwie klasy są abstrakcujne bo kazda klasa dziedzicąca tez musi wykorzystać te metody do polecenia i prościej
    // potem to tylko wykorzystać nadpisując

    @Override
    public String toString() {
        return name + " " + age;
    }
}
