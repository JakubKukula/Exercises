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
        zofia.addGrade(new Grade(Subject.MATH,    GradeValue.C));
        zofia.addGrade(new Grade(Subject.POLISH,  GradeValue.C));
        zofia.addGrade(new Grade(Subject.HISTORY, GradeValue.C));
        zofia.addGrade(new Grade(Subject.PE,      GradeValue.B));
        zofia.addGrade(new Grade(Subject.BIOLOGY, GradeValue.C));
        diplomas.add(zofia);

        Diploma anna = new Diploma("Anna", "Kowalska", LocalDate.of(2024, 6, 28));
        anna.addGrade(new Grade(Subject.MATH,    GradeValue.B));
        anna.addGrade(new Grade(Subject.POLISH,  GradeValue.C));
        anna.addGrade(new Grade(Subject.ENGLISH, GradeValue.B));
        anna.addGrade(new Grade(Subject.BIOLOGY, GradeValue.C));
        anna.addGrade(new Grade(Subject.HISTORY, GradeValue.B));
        diplomas.add(anna);

        Diploma marek = new Diploma("Marek", "Wójcik", LocalDate.of(2023, 6, 23));
        marek.addGrade(new Grade(Subject.POLISH,  GradeValue.B));
        marek.addGrade(new Grade(Subject.ENGLISH, GradeValue.B));
        marek.addGrade(new Grade(Subject.MATH,    GradeValue.C));
        marek.addGrade(new Grade(Subject.BIOLOGY, GradeValue.C));
        marek.addGrade(new Grade(Subject.PHYSICS, GradeValue.C));
        diplomas.add(marek);

        Diploma piotr = new Diploma("Piotr", "Nowak", LocalDate.of(2023, 6, 23));
        piotr.addGrade(new Grade(Subject.MATH,    GradeValue.A));
        piotr.addGrade(new Grade(Subject.POLISH,  GradeValue.D));
        piotr.addGrade(new Grade(Subject.PHYSICS, GradeValue.C));
        piotr.addGrade(new Grade(Subject.ENGLISH, GradeValue.C));
        piotr.addGrade(new Grade(Subject.PE,      GradeValue.A));
        diplomas.add(piotr);

        System.out.println(Diploma.findBestAverage(diplomas));

        // Zofia = ?, Anna = ?, Marek = ?, Piotr = ?
        // ślad bestAverage:
        // 1. Zofia: result == null → nie sprawdza czy średnie jest jest większa  bestAverage = średnia z metody
        // 2. Anna:  sprawdza sredna zofii < srednia anna → jeżeli tak nadpisuje best average   bestAverage = ?
        // 3. Marek: ponownie ...
        // 4. Piotr: ponownie...
        // wynik: anna kowalska   dlaczego nie ten drugi z tą samą średnią: bo best average nie sprawdza czy jest taka
        // tylko czy jest większa.
    }
}
