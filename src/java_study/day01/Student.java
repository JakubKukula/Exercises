package java_study.day01;

public class Student {

    private String name;
    private static int counter;

    public Student(String name) {
        this.name = name;
        counter++;
    }

    void introduceYourself(){
        System.out.println(name);
    }

    static int getStudentCount(){
        return counter;
    }
    // po zmianie licznik na name wyśletlany komunikat
    // "java: non-static variable name cannot be referenced from a static context"

    // po wstawieniu static int x = 0;
    // "java: illegal start of expression"

}
