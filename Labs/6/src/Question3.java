//Question 9.7
public class Question3 {

	public static void main(String[] args) {
		Account.setAnnualInterestRate(4.5);
	    Account account = new Account(1122, 20000);
	    account.withdraw(2500);
	    account.deposit(3000);
	    System.out.println("Account-" + account.getId());
	    System.out.printf("   Balance:          $%,.2f%n", account.getBalance());
	    System.out.printf("   Monthly interest: $%,.2f%n", account.getMonthlyInterest());
	    System.out.printf("   Date Created:     %s%n", account.getDateCreated().toString());
	}

}
