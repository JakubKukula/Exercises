package java_study.day21;

public class BankAccount {

    private final String owner;
    private static int nextNumber = 1000; // bo ilośc kont mam widzieć każde założone konto i mieć większą o 1
    private final int uniqueNumber;
    private double balance = 0.0;
    private final double maxWithdrawal;

    public BankAccount(String owner, double maxWithdrawal) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("You must enter the owner");
        }
        this.owner = owner;
        this.uniqueNumber = nextNumber;
        if (maxWithdrawal < 0) {
            throw new IllegalArgumentException("Enter correct max withdrawal");
        }
        this.maxWithdrawal = maxWithdrawal;
        nextNumber++;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be 0 or less than 0");
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > maxWithdrawal) {
            return false;
        }
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public String getOwner() {
        return owner;
    }

    public static int getAccountCount() { // bo pole nextNumber jest static i żeby można było sparawdzić ilośc kont bez tworzenia obiektu
        return nextNumber - 1000;
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
