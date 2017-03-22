//Question 10.11
class Circle2D {
    private final double x;
    private final double y;
    private final double radius;

    Circle2D() {
        this(0, 0, 1);
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    boolean contains(double x, double y) {
        return distance(x, y) < radius;
    }

    boolean contains(Circle2D circle) {
        return distance(circle.x, circle.y) <= Math.abs(radius - circle.radius);
    }

    boolean overlaps(Circle2D circle) {
        return distance(circle.x, circle.y) <= radius + circle.radius && !contains(circle);
    }

    double distance(double x, double y) {
    	return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
}