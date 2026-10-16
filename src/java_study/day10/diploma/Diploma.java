package java_study.day10.diploma;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Diploma {

    private String name;
    private String surname;
    private String issueData;

    private Set<Grade> gradesList = new HashSet<>();

    public Diploma(String name, String surname, String issueData) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }
        this.surname = surname;
        this.issueData = issueData;
    }

    public void addGrade(Grade grade) {
        if (grade == null) {
            throw new IllegalArgumentException("Grade cannot be null");
        }
        if (!gradesList.add(grade)) {
            throw new IllegalArgumentException("Grade " + grade + " was already added to the diploma");
        }
    }

    public Diploma bestAverage(List<Diploma> diplomaList) {
        if (diplomaList == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Diploma result = null;
        double bestAverage = 0;
        for (Diploma diploma : diplomaList) {
            double sum = 0;
            int counter = 0;
            for (Grade grade : diploma.getGradesList()) {
                sum += grade.getGradeValue().getValue();
                counter++;
            }
            double average = sum / counter;
            if (result == null || bestAverage < average) {
                result = diploma;
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIssueData() {
        return issueData;
    }

    public void setIssueData(String issueData) {
        this.issueData = issueData;
    }

    public Set<Grade> getGradesList() {
        return gradesList;
    }

    public void setGradesList(Set<Grade> gradesList) {
        this.gradesList = gradesList;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + gradesList + " " + issueData;
    }
}
