//Question 9.5
import java.util.GregorianCalendar;
public class Question2 {

	public static void main(String[] args) {
		//Create calendar
	    GregorianCalendar gregorianCalendar = new GregorianCalendar();

	    //Current Date
	    System.out.println("Current");
	    printDate(gregorianCalendar);

	    //Time from January 1, 1970
	    System.out.println("1234567898765L");
	    gregorianCalendar.setTimeInMillis(1234567898765L);
	    printDate(gregorianCalendar);
	}
	
	//Method to print the date
	private static void printDate(GregorianCalendar gregorianCalendar) {
	    System.out.printf("   Year:  %s%n", gregorianCalendar.get(GregorianCalendar.YEAR));
	    System.out.printf("   Month: %s%n", gregorianCalendar.get(GregorianCalendar.MONTH));
	    System.out.printf("   Day:   %s%n", gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
	    System.out.println();
	}
}


