//Question 11.3
import java.util.Date;
public class SubclassesOfAccount {
	 public static void main(String[] args) {
	        Account[] accounts = new Account[3];

	        accounts[0] = new Account(231, 123.0);
	        accounts[1] = new CheckingAccount(211, 234.0, 23.0);
	        accounts[2] = new SavingsAccount(111, 2345.0);

	        for (Account account: accounts) {
	            System.out.println(account);
	        }
	    }
	 }