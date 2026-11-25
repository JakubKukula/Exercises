package java_study.day21;

public class BankAccount {

    private final String owner;
    private static int number = 1000; // bo ilośc kont mam widzieć każde założone konto i mieć większą o 1
    private final int uniqueNumber;
    private double balance = 0.0;
    private final double maxWithdrawal;

    public BankAccount(String owner, double maxWithdrawal) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("You must enter the owner");
        }
        this.owner = owner;
        this.uniqueNumber = number;
        number++;
        if (maxWithdrawal < 0) {
            throw new IllegalArgumentException("Enter correct max withdrawal");
        }
        this.maxWithdrawal = maxWithdrawal;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be 0 or less than 0");
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance || amount > maxWithdrawal) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public String getOwner() {
        return owner;
    }

    public static int getNumber() { // bo pole number jest static i żeby można było sparawdzić ilośc kont bez tworzenia obiektu
        return number;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxWithdrawal() {
        return maxWithdrawal;
    }

    @Override
    public String toString() {
        return uniqueNumber + " " + owner + " " + balance;
    }
}
