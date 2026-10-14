package java_study.day09.person;

public class Main {
    public static void main(String[] args) {

        new Person("Jan", "Kowalski", EyeColor.BLUE, HairColor.BLONDE);
        new Person("Anna", "Nowak", EyeColor.BROWN, HairColor.DARK_BLOND);
        new Person("Piotr", "Wiśniewski", EyeColor.DARK, HairColor.WHITE);
        new Person("Kasia", "Wójcik", EyeColor.BLUE, HairColor.BLONDE);
        new Person("Tomasz", "Kamiński", EyeColor.BROWN, HairColor.DARK_BLOND);
        new Person("Marta", "Lewandowska", EyeColor.DARK, HairColor.BLONDE);
        new Person("Adam", "Zieliński", EyeColor.BLUE, HairColor.WHITE);
        new Person("Ola", "Szymańska", EyeColor.BROWN, HairColor.BLONDE);
        new Person("Michał", "Woźniak", EyeColor.DARK, HairColor.DARK_BLOND);
        new Person("Natalia", "Dąbrowska", EyeColor.BLUE, HairColor.DARK_BLOND);

        System.out.println(Person.firstBySurnameWithHairColor(HairColor.BLONDE));


    }
}
