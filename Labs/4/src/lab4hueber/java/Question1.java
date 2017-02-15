//Question 6.9
package lab4hueber.java;

public class Question1 {
	
	//Conversion for feet to meters
	public static double footMeter(double foot) {
		return 0.305 * foot;
	}
	
	//Conversion from meters to feet
	public static double meterFoot (double meter) {
		return 3.279 * meter;
	}
	public static void main(String[] args) {
		System.out.println("Feet    Meters    |    Meters    Feet");
		System.out.println("-------------------------------------");
		
		for (int i = 1, j = 20; i <= 10; i++, j+= 5) {
			System.out.printf("%4.1f    %-9.3f |    %-9.1f  %7.3f%n", i + 0.0, footMeter(i), j + 0.0, meterFoot(j));
		}
	}

}
