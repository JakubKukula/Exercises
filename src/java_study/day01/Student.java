package java_study.day01;

public class Student {

    private String name;
    static int licznik = 0;

    public Student(String name) {
        this.name = name;
        licznik++;
    }

    void introduceYourself(){
        System.out.println(name);
    }

    static int studentsCounter(){
        return licznik;
    }
    // po zmianie licznik na name wyśletlany komunikat
    // "java: non-static variable name cannot be referenced from a static context"

    // po wstawieniu static int x = 0;
    // "java: illegal start of expression"

}
