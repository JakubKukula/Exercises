package java_study.day01;

public class Main {
    static void main(String[] args) {

        Student s1 = new Student("Jakub");
        Student s2 = new Student("Ola");
        Student s3 = new Student("Ala");

        s1.introduceYourself();
        s2.introduceYourself();
        s3.introduceYourself();

        System.out.println(Student.getStudentCount());
    }
}



