package java_study.day22.language.school;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {

    private String name;
    private final String email;

    private Set<Course> courses = new HashSet<>();

    public Student(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Enter true name");
        }
        this.name = name;
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Enter true email");
        }
        if (!checkEmail(email)) {
            throw new IllegalArgumentException("Incorrect email");
        }
        this.email = email;
    }

    public boolean addCourse(Course course) {
        if (courses.contains(course)) {
            return true;
        }
        boolean courseHasMe = course.getStudents().contains(this);
        if (!courseHasMe && course.getStudents().size() == course.getMaxStudent()) {
            return false;
        }
        courses.add(course);
        course.addStudent(this);
        return true;
    }

    public double coursesPrice() {
        double sum = 0;
        for (Course course : courses) {
            sum += course.getLanguages().getPricePreMonth();
        }
        return sum;
    }

    public boolean checkEmail(String email) {
        String normalize = email.trim().toLowerCase();
        int at = normalize.indexOf("@");
        return at > 0 && at != normalize.length() - 1 && at == normalize.lastIndexOf("@");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Set<Course> getCourses() {
        return new HashSet<>(courses);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public String toString() {
        return name + " " + email;
    }
}
