package java_study.day22.language.school;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course a1 = new Course("Angielski A1", Languages.ENGLISH, 1);
        Course de = new Course("Niemiecki", Languages.GERMAN, 2);
        Course b2 = new Course("Angielski B2", Languages.ENGLISH, 5);
        Student ala = new Student("Ala", "ala@x.pl");
        Student bo = new Student("Bartek", "bo@x.pl");
        Student alicja = new Student("Alicja", "ala@x.pl");      // ten sam e-mail co Ala

        System.out.println(Course.getCountCourses());            // 3
        System.out.println(a1.addStudent(ala));                  // true   ostatnie miejsce, zapis od strony kursu
        System.out.println(ala.getCourses().size());             // 1   ← czy Ala widzi kurs?
        System.out.println(a1.addStudent(ala));                  // true bo posiada   drugi raz ten sam
        System.out.println(bo.addCourse(a1));                    // false   kurs pełny
        System.out.println(bo.getCourses().size());              // 0   ← czy Bartek nie ma „połowy” zapisu?
        System.out.println(bo.addCourse(de));                    // true
        System.out.println(de.addStudent(alicja));               // true   ostatnie miejsce
        System.out.println(alicja.getCourses().size());          // 1
        System.out.println(de.addStudent(ala));                  // true
        System.out.println(ala.equals(alicja));                  // true
        System.out.println(ala.addCourse(b2));                   // true
        System.out.println(ala.coursesPrice());                  //200.0
        System.out.println(bo.coursesPrice());                   // 120.0

        School school = new School(List.of(a1, de, b2));
        System.out.println(school.students().size());            //2
        System.out.println(school.overview().get(Languages.ENGLISH));   // 1   (według Twojej decyzji z pkt 3)
        System.out.println(school.overview().get(Languages.GERMAN));    // 2
//        new Course("Hiszpański", Languages.SPANISH, 0);  // → wyjątek
        System.out.println(Course.getCountCourses());    // 3   ←czy nieudany kurs podbił licznik ? nie
    }
}
