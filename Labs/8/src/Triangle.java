//Question 11.1
public class Triangle extends GeometricObject{
	double side1;
	double side2;
	double side3;
	
	//Triangle Class
	public Triangle() {
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return filled;
	}

}
