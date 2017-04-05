//Question 12.5
public class IllegalTriangleException extends Exception {
	public IllegalTriangleException(String message) {
	    super("Invalid triangle: (" + message + ")");
	}
}