//Question 13.9
public class Question5 {
	public static void main(String[] args) {
        Circle3 circle1 = new Circle3(3);
        Circle3 circle2 = new Circle3(4);
        Circle3 circle3 = new Circle3(5);
        Circle3 circle4 = new Circle3(6);

        System.out.println("circle1.compareTo(circle2) = " + circle1.compareTo(circle2));
        System.out.println("circle2.compareTo(circle3) = " + circle2.compareTo(circle3));
        System.out.println("circle3.compareTo(circle4) = " + circle3.compareTo(circle4));
        System.out.println("circle4.compareTo(circle1) = " + circle4.compareTo(circle1));
    }
}

abstract class GeometricObject3 {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Construct a default geometric object
    protected GeometricObject3() {
        dateCreated = new java.util.Date();
    }

    //Construct a geometric object with its properties
    protected GeometricObject3(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //Return color
    public String getColor() {
        return color;
    }

    //Set a new color
    public void setColor(String color) {
        this.color = color;
    }

    // Return filled
    public boolean isFilled() {
        return filled;
    }

    //Set filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Get dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    //Return a string representation of this object
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    //Abstract method getArea
    public abstract double getArea();

    //Abstract method getPerimeter
    public abstract double getPerimeter();
}

class Circle3 extends GeometricObject3 implements Comparable<Circle3>{
    private double radius;

    public Circle3() {
    }

    public Circle3(double radius) {
        this.radius = radius;
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Return diameter
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    @Override
    public int compareTo(Circle3 o) {
        if (this.equals(o)) {
            return 0;
        } else if (this.radius > o.radius) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Circle3 && this.radius == ((Circle3) o).radius;
    }
}
