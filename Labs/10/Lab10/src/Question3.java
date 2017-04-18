//Question 13.5
public class Question3 {

    private static Circle circle1 = new Circle(Math.random() * 10);
    private static Circle circle2 = new Circle(Math.random() * 10);

    private static Rectangle rectangle1 = new Rectangle(Math.random() * 10, Math.random() * 10);
    private static Rectangle rectangle2 = new Rectangle(Math.random() * 10, Math.random() * 10);

    public static void main(String[] args) {
        System.out.printf("Area of circle1 = %.3f%n", circle1.getArea());
        System.out.printf("Area of circle2 = %.3f%n", circle2.getArea());
        System.out.printf("Area of rectangle1 = %.3f%n", rectangle1.getArea());
        System.out.printf("Area of rectangle2 = %.3f%n", rectangle2.getArea());
        System.out.println();
        System.out.println((circle1 == GeometricObject1.Max(circle1, circle2) ?
                "circle1" : "circle2") + " is the larger circle");
        System.out.println((rectangle1 == GeometricObject1.Max(rectangle1, rectangle2) ?
                "rectangle1" : "rectangle2") + " is is the larger rectangle");
    }
}
