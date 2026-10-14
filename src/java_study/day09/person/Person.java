package java_study.day09.person;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private final EyeColor eyeColor;
    private HairColor hairColor;

    private static final List<Person> extent = new ArrayList<>();

    public Person(String name, String surname, EyeColor eyeColor, HairColor hairColor) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }
        this.surname = surname;
        if (eyeColor == null) {
            throw new IllegalArgumentException("Eye color cannot be null");
        }
        this.eyeColor = eyeColor;
        if (hairColor == null) {
            throw new IllegalArgumentException("Hair color cannot be null");
        }
        this.hairColor = hairColor;
        extent.add(this);
    }

    public static List<Person> getExtent() {
        return new ArrayList<>(extent);
    }

    public static List<Person> findByEyeColor(EyeColor eyeColor) {
        if (eyeColor == null) {
            throw new IllegalArgumentException("Choose right eye color");
        }
        List<Person> result = new ArrayList<>();
        for (Person person : extent) {
            if (person.getEyeColor() == eyeColor) {
                result.add(person);
            }
        }
        return result;
    }


    public static int countByHairColor(HairColor hairColor) {
        if (hairColor == null) {
            throw new IllegalArgumentException("Choose right hair color");
        }
        int result = 0;
        for (Person person : extent) {
            if (person.getHairColor() == hairColor) {
                result++;
            }
        }
        return result;
    }

    public static Person longestSurnameWithEyeColor(EyeColor eyeColor) {
        if (eyeColor == null) {
            throw new IllegalArgumentException("Choose right eye color");
        }
        List<Person> specifiedEyeColor = findByEyeColor(eyeColor);
        if (specifiedEyeColor.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        Person result = specifiedEyeColor.getFirst();
        for (Person person : specifiedEyeColor) {
            if (result.getSurname().length() < person.getSurname().length()) {
                result = person;
            }
        }
        return result;
    }

    public static Person firstBySurnameWithHairColor(HairColor hairColor) {
        if (hairColor == null) {
            throw new IllegalArgumentException("Choose right hair color");
        }
        Person result = null;
        for (Person person : extent) {
            if (person.getHairColor() == hairColor && (result == null || person.getSurname().compareTo(result.getSurname()) < 0)) {
                result = person;
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("No one has hair with " + hairColor + " color");
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", eye color: " + eyeColor + ", hair color: " + hairColor;
    }
}
