//Question 6.18
package lab4hueber.java;

import java.util.Scanner;

public class Question4 {
	
	//Method to check if the password is valid
	public static boolean passwordCheck(String password) {
		int length = password.length();
		int digits = 0;
		
		if (length < 8){
			return false;
		}
		
		for (int i = 0; i < length; i++) {
			char ch = password.charAt(i);
			 if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))
				return false;
	         if (ch >= '0' && ch <= '9') digits++;
		}
		return digits >= 2;
	}

	public static void main(String[] args) {
		//User input for password
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.print("Enter password: ");
	        
	        String password = scanner.nextLine();
	        
	        System.out.println(passwordCheck(password) ? "Valid Password" : "Invalid Password");
	}

}
