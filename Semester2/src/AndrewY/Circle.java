package AndrewY;

public class Circle extends Shape implements TwoDimComputable {
    private double radius;
    public Circle() {
        super();
        radius = 1.0;
    }
    public Circle(double r) {
        super();
        radius = r;
    }
    public Circle(double r, String c, boolean f) {
        super(c, f);
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return Math.PI * (2 * radius);
    }
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
