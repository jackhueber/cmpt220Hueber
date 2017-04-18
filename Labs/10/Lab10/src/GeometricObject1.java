//Question 13.5
abstract class GeometricObject1 implements Comparable<GeometricObject1>{

    public abstract double getArea();

    static GeometricObject1 Max(GeometricObject1 o1, GeometricObject1 o2)
            throws NullPointerException{
        if (o1 == null || o2 == null) {
            throw new NullPointerException();
        }
        return o1.compareTo(o2) >= 0 ? o1 : o2;
    }

    @Override
    public int compareTo(GeometricObject1 o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}
