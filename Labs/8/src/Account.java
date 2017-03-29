//Question 11.3
import java.util.Date;
public class Account extends SubclassesOfAccount {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private final Date dateCreated = new Date();

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100.0);
    }

    public int withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return 1;
        } else {
            return -1;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" + "id = " + id + ", balance = " + balance + ", dateCreated = " + dateCreated + '}';
    }
}