package AndrewY;

public class Square extends Rectangle implements TwoDimComputable {
    public Square() {
        super();
    }
    public Square(double s) {
        super(s, s);
    }
    public Square(double s, String c, boolean f) {
        super(s, s, c ,f);
    }
    public double getSide() {
        return super.getLength();
    }
    public void setSide(double s) {
        super.setLength(s);
        super.setWidth(s);
    }
    public void setLength(double s) {
        setSide(s);
    }
    public void setWidth(double s) {
        setSide(s);
    }
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
