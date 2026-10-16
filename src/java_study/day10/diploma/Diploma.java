package java_study.day10.diploma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diploma {

    private final String name;
    private final String surname;
    private final LocalDate issueDate;

    private List<Grade> grades = new ArrayList<>();

    public Diploma(String name, String surname, LocalDate issueDate) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }
        this.surname = surname;
        if (issueDate == null) {
            throw new IllegalArgumentException("Issue date cannot be null");
        }
        this.issueDate = issueDate;
    }

    public void addGrade(Grade grade) {
        if (grade == null) {
            throw new IllegalArgumentException("Grade cannot be null");
        }
        if (grades.contains(grade)) {
            throw new IllegalArgumentException("Grade " + grade + " was already added");
        }
        grades.add(grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Grade grade : grades) {
            sum += grade.getGradeValue().getValue();
        }
        return sum / grades.size();
    }

    public static Diploma findBestAverage(List<Diploma> diplomaList) {
        if (diplomaList == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Diploma result = null;
        double bestAverage = 0;
        for (Diploma diploma : diplomaList) {
            double average = diploma.getAverage();
            if (result == null || bestAverage < average) {
                result = diploma;
                bestAverage = average;
            }
        }
        return result;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public String getName() {
        return name;
    }

    public List<Grade> getGradesList() {
        return new ArrayList<>(grades);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + grades + " " + issueDate;
    }
}
