package java_study.day22.language.school;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {

    private String name;
    private String email;

    private Set<Course> courses = new HashSet<>();

    public Student(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Enter true name");
        }
        this.name = name;
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Enter true email");
        }
        checkEmail(email);
        this.email = email;
    }

    public boolean addCurse(Course course) {
        if (course.getStudents().size() == course.getMaxStudent()) {
            return false;
        }
        if (!courses.add(course)) {
            return false;
        }
        courses.add(course);
        course.addStudent(this);
        return true;
    }

    public double cursesPrice() {
        double sum = 0;
        for (Course course : courses) {
            sum += course.getLanguages().getPrizePreMonth();
        }
        return sum;
    }

    public boolean checkEmail(String email) {
        String normalize = email.trim().toLowerCase();
        int at = normalize.indexOf("@");
        return at == 0 || at == normalize.length() - 1 && at == normalize.lastIndexOf("@");
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
