//Question 9.1 Test
public class Question1 {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle (4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		//Print data for each rectangle
		System.out.print("Rectangle #1 \n");
		rectangleData(rectangle1);
		System.out.print("---------------- \n");
		System.out.print("Rectangle #2 \n");
		rectangleData(rectangle2);
	}
	
	public static void rectangleData(Rectangle rectangle) {
		System.out.println("Width: " + rectangle.width);
		System.out.println("Height: " + rectangle.height);
		System.out.println("Area: " + rectangle.getArea());
		System.out.println("Perimeter: " + rectangle.getPerimeter());
	}
}
