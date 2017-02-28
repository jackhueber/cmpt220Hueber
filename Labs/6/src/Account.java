//Question 9.7
import java.util.Date;
public class Account {
	int id = 0;
	double balance = 0;
	final Date dateCreated = new Date();
	static double annualInterestRate = 0;


	Account() {
	}
	
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	Date getDateCreated() {
		return dateCreated;
	}
	
	int getId() {
		return id;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance (double balance) {
		this.balance = balance;
	}
	
	static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100); 
	}
	
	void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    void deposit(double amount) {
        balance += amount;
    }
}