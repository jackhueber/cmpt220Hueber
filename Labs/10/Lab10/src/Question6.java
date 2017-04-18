//Question 13.11
public class Question6 {
	public static void main(String[] args) {
        Octagon octagon1 = new Octagon(4);
        Octagon octagon2 = (Octagon) octagon1.clone();

        System.out.println("octagon1");
        System.out.println("  Perimeter = " + octagon1.getPerimeter());
        System.out.println("  Area = " + octagon1.getArea());
        System.out.println("octagon2");
        System.out.println("  Perimeter = " + octagon2.getPerimeter());
        System.out.println("  Area = " + octagon2.getArea());
        System.out.println();
        System.out.println("octagon1 compared to octagon2 = " + octagon1.compareTo(octagon2));
    }
}

abstract class GeometricObject4 {
    private String color = "red";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject4() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject4(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //Return Color
    public String getColor() {
        return color;
    }

    //Set Color
    public void setColor(String color) {
        this.color = color;
    }

    //Return Filled
    public boolean isFilled() {
        return filled;
    }

    //Set Filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Date Created
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
    
    //Abstract getArea method
    public abstract double getArea();
   
    //Abstract getPerimeter method
    public abstract double getPerimeter();
}

class Octagon extends GeometricObject4 implements Comparable<Octagon>, Cloneable{
    double side = 1;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if (this.equals(o)) {
            return 0;
        } else if (this.side > o.side) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Octagon && this.side == ((Octagon)o).side;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}

