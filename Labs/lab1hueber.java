//2.1

public class Test {
  public void main(string[] args) { // Missing Static and string should be capitailized
    double i = 50.0;
    double k = i + 50.0;
    double j = k + 1;

      System.out.println("j is " + j + " and k is " + k);
    }
  }

//2.5

public class Test {
  public static void main(String[] args) {
    int i = k + 2;	// k is not defined
	
      System.out.println(i);
    }
  }

//2.6

  public class Test {
    public static void main(String[] args) {
      int i = j = k = 2; // Must intialize each variable seperately
	  
        System.out.println(i + " " + j + " " + k);
    }
  }

//2.9

public class Test {
  public static void main(String[] args) {
	double miles = 100;
	final double KILOMETERS_PER_MILE = 1.609;
    double kilometers = miles * KILOMETERS_PER_MILE;
    
	  System.out.println("kilometers"); // kilometers will be printed as 160.9
  }