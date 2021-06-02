package AndrewY;

public class Box extends Rectangle implements ThreeDimComputable {
    private double height;
    public Box() {
        super();
        height = 1.0;
    }
    public Box(double l, double w, double h) {
        super(w, l);
        height = h;
    }
    public Box(double l, double w, double h, String c, boolean f) {
        super(w, h, c, f);
        height = h;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double h) {
        height = h;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
    public double getSurfaceArea() {
        return 2*super.getArea() + 2*super.getLength()*height + 2*super.getWidth()*height;
    }
    public String toString() {
        return "A Box with width=" + super.getWidth() + ", length=" + super.getLength() + ", and height=" +
                height + ", which is a subclass of " + super.toString();
    }
}
