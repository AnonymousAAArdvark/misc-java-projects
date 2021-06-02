package AndrewY;

public class Sphere extends Circle implements ThreeDimComputable {
    public Sphere() {
        super();
    }
    public Sphere(double r) {
        super(r);
    }
    public Sphere(double r, String s, boolean f) {
        super(r, s, f);
    }
    public double getVolume() {
        return 4.0/3.0 * Math.PI * Math.pow(super.getRadius(), 3);
    }
    public double getSurfaceArea() {
        return 4 * super.getArea();
    }
    public String toString() {
        return "A Sphere with radius=" + super.getRadius() + ", which is a subclass of " + super.toString();
    }
}
