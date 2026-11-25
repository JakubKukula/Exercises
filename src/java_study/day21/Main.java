package java_study.day21;

public class Main {
    public static void main(String[] args) {

        BankAccount a = new BankAccount("Ala", 100);
        BankAccount b = new BankAccount("Bartek", 50);
        a.deposit(200);
        System.out.println(a.withdraw(100));   // true
        System.out.println(a.withdraw(101));   // false
        System.out.println(a);                 // 1000 Ala 100.0
        System.out.println(b.withdraw(1));     // false
        System.out.println(b);                 // 1001 Bartek 0.0
        System.out.println(BankAccount.getAccountCount()); // 2
        //a.deposit(0);                          //  wyjątek
        //new BankAccount("   ", 100);           // wyjątek
        BankAccount c = new BankAccount("Cel", 100);
        c.deposit(50);
        System.out.println(c.withdraw(-20));   // true
        System.out.println(c);                 // 1000 Cel 50.0   ← teraz jest dobrze
    }
}
