package java_study.day22.language.school;

import java.util.HashSet;
import java.util.Set;

public class Course {

    private String name;
    private final Languages languages;
    private final int maxStudent;
    private final int courseNumber;
    private static int countCourses = 0;

    private Set<Student> students = new HashSet<>();

    public Course(String name, Languages languages, int maxStudent, int courseNumber) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Enter curse name");
        }
        this.name = name;
        this.languages = languages;
        if (maxStudent <= 0) {
            throw new IllegalArgumentException("Max Students cannot be less by 0");
        }
        this.maxStudent = maxStudent;
        countCourses++;
        this.courseNumber = countCourses;
    }

    public boolean addStudent(Student student) {
        if (students.size() == maxStudent) {
            return false;
        }
        if (!students.add(student)) {
            return false;
        }
        students.add(student);
        student.addCurse(this);
        return true;
    }

    public String getName() {
        return name;
    }

    public Languages getLanguages() {
        return languages;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public static int getCountCourses() {
        return countCourses;
    }

    public Set<Student> getStudents() {
        return new HashSet<>(students);
    }


    @Override
    public String toString() {
        return name + " " + maxStudent;
    }
}
