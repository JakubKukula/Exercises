package java_study.day10.diploma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Stworz klase Dyplom ktora posiada imie i nazwisko, date wystawienia, na
        //dyplomie znajduja sie oceny z przedmiotow(lista klasy Ocena, gdzie ocena ma
        // wartosc i nazwe przedmiotu)
        //stworz kilka dyplomow, znajdz dyplom z najwieksza srednia

        List<Diploma> diplomas = new ArrayList<>();

        Diploma zofia = new Diploma("Zofia", "Wiśniewska", LocalDate.of(2024, 6, 28));
        zofia.addGrade(new Grade(Subject.MATH, GradeValue.C));
        zofia.addGrade(new Grade(Subject.POLISH, GradeValue.C));
        zofia.addGrade(new Grade(Subject.HISTORY, GradeValue.C));
        zofia.addGrade(new Grade(Subject.PE, GradeValue.B));
        zofia.addGrade(new Grade(Subject.BIOLOGY, GradeValue.C));
        diplomas.add(zofia);

        Diploma anna = new Diploma("Anna", "Kowalska", LocalDate.of(2024, 6, 28));
        anna.addGrade(new Grade(Subject.MATH, GradeValue.B));
        anna.addGrade(new Grade(Subject.POLISH, GradeValue.C));
        anna.addGrade(new Grade(Subject.ENGLISH, GradeValue.B));
        anna.addGrade(new Grade(Subject.BIOLOGY, GradeValue.C));
        anna.addGrade(new Grade(Subject.HISTORY, GradeValue.B));
        diplomas.add(anna);

        Diploma marek = new Diploma("Marek", "Wójcik", LocalDate.of(2023, 6, 23));
        marek.addGrade(new Grade(Subject.POLISH, GradeValue.B));
        marek.addGrade(new Grade(Subject.ENGLISH, GradeValue.B));
        marek.addGrade(new Grade(Subject.MATH, GradeValue.C));
        marek.addGrade(new Grade(Subject.BIOLOGY, GradeValue.C));
        marek.addGrade(new Grade(Subject.PHYSICS, GradeValue.C));
        diplomas.add(marek);

        Diploma piotr = new Diploma("Piotr", "Nowak", LocalDate.of(2023, 6, 23));
        piotr.addGrade(new Grade(Subject.MATH, GradeValue.A));
        piotr.addGrade(new Grade(Subject.POLISH, GradeValue.D));
        piotr.addGrade(new Grade(Subject.PHYSICS, GradeValue.C));
        piotr.addGrade(new Grade(Subject.ENGLISH, GradeValue.C));
        piotr.addGrade(new Grade(Subject.PE, GradeValue.A));
        diplomas.add(piotr);

        System.out.println(Diploma.findBestAverage(diplomas));

        System.out.println(zofia.getAverage());
        System.out.println(anna.getAverage());
        System.out.println(marek.getAverage());
        System.out.println(piotr.getAverage());

        // Zofia = ?  Anna = ?  Marek = ?  Piotr = ?
    // 1. Zofia: result == null          → result = Zofia, bestAverage = 4.2
    // 2. Anna:  4.2 < 4.6 → tak         → result = Anna,     bestAverage = 4.6
    // 3. Marek: 4.6 < 4.4 → nie         → result = Anna,     bestAverage = 4.6
    // 4. Piotr: 4.6 < 4.6 → nie         → result = Anna,     bestAverage = 4.6

        /*
        Grade g1 = new Grade(Subject.MATH, GradeValue.C);
        Grade g2 = new Grade(Subject.MATH, GradeValue.C);
        Grade g3 = new Grade(Subject.MATH, GradeValue.B);
        g1 == g2                          // false
        g1.equals(g2)                     // true
        g1.equals(g3)                     // false
        g1.hashCode() == g2.hashCode()    // true
        d.addGrade(g1); d.addGrade(g2);   // jeżeli equals i hashcode jest nadpisane to wyżyci wyjątek
        throw new IllegalArgumentException("Grade " + grade + " was already added");
        a jeżeli nie to doda g2 do listy ocen
         */
    }
}
