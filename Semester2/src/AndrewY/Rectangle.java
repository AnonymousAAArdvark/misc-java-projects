package AndrewY;

public class Rectangle extends Shape implements TwoDimComputable {
    private double width;
    private double length;
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double w, double l) {
        super();
        width = w;
        length = l;
    }
    public Rectangle(double w, double l, String c, boolean f) {
        super(c, f);
        width = w;
        length = l;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double w) {
        width = w;
    }
    public void setLength(double l) {
        length = l;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of "
                + super.toString();
    }
}
