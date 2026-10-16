package java_study.day10.diploma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diploma {

    private String name;
    private String surname;
    private LocalDate issueDate;

    private List<Grade> gradesList = new ArrayList<>();

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
        if (gradesList.contains(grade)) {
            throw new IllegalArgumentException("Grade " + grade + " was already added");
        }
        gradesList.add(grade);
    }

    public double getAverage() {
        if (gradesList.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Grade grade : gradesList) {
            sum += grade.getGradeValue().getValue();
        }
        return sum / gradesList.size();
    }

    public static Diploma bestAverage(List<Diploma> diplomaList) {
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

    public String getName() {
        return name;
    }

    public List<Grade> getGradesList() {
        return new ArrayList<>(gradesList);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + gradesList + " " + issueDate;
    }
}
