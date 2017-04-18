//Question 13.7
public class Question4 {
	public static void main(String[] args) {
        GeometricObject2[] shapes = generateShapesArray(5);
        displayShapeInfo(shapes);
    }

    private static void displayShapeInfo(GeometricObject2[] shapes) {
        for (GeometricObject2 shape : shapes) {
            System.out.println(shape.getClass() + "\n   Area: " + shape.getArea());
            if (shape instanceof Colorable) {
                System.out.print("   ");
                ((Colorable) shape).howToColor();
            }
        }
    }

    private static GeometricObject2[] generateShapesArray(int size) {
        GeometricObject2[] shapes = new GeometricObject2[size];
        for (int i = 0; i <shapes.length ; i++) {
            if ((int) (Math.random() * 2) == 0) {
                shapes[i] = new Square(i + 1);
            } else {
                shapes[i] = new Circle1(i + 1);
            }
        }
        return shapes;
    }
}

interface Colorable{
    void howToColor();
}

abstract class GeometricObject2{
    public abstract double getArea();
}

class Square extends GeometricObject2 implements Colorable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Circle1 extends GeometricObject2{
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}