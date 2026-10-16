package java_study.day10.diploma;

public class Grade {

    private final Subject subject;
    private final GradeValue gradeValue;

    public Grade(Subject subject, GradeValue gradeValue) {
        if (subject == null){
            throw new IllegalArgumentException("Subject cannot be null");
        }
        this.subject = subject;
        if (gradeValue == null){
            throw new IllegalArgumentException("Grade value cannot be null");
        }
        this.gradeValue = gradeValue;
    }

    public Subject getSubject() {
        return subject;
    }

    public GradeValue getGradeValue() {
        return gradeValue;
    }

    @Override
    public String toString() {
        return subject + ": " + gradeValue;
    }
}
