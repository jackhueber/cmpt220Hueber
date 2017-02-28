//Question 9.1
public class Rectangle {
	double width;
	double height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	 public double getArea() {
		 return width * height;
	 }
	 
	 public double getPerimeter() {
		 return (2 * width) + (2 * height);
	 }
}

