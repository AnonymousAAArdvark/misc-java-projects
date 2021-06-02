package AndrewY;

public class Cube extends Box implements ThreeDimComputable {
    public Cube() {
        super();
    }
    public Cube(double s) {
        super(s, s, s);
    }
    public Cube(double s, String c, boolean f) {
        super(s, s, s, c, f);
    }
    public double getSide() {
        return super.getHeight();
    }
    public void setSide(double s) {
        super.setHeight(s);
        super.setLength(s);
        super.setWidth(s);
    }
    public void setHeight(double s) {
        setSide(s);
    }
    public void setLength(double s) {
        setSide(s);
    }
    public void setWidth(double s) {
        setSide(s);
    }
    public String toString() {
        return "A Cube with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
