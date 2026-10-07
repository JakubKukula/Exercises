package java_study.day02;

public class Account {

    private final String number;
    public static final double FEE = 2.5;

    public Account(String number) {
        this.number = number;
    }

    public void changeNumber(String newNumber) {
        //number = newNumber;
        //ta operacja jest nie możliwa bo przypisanie może wystąpić tylko w konstruktorze lub deklaracji
    }

    @Override
    public String toString() {
        return number + " " + FEE;
    }
}
