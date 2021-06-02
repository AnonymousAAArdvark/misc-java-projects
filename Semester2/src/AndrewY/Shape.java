package AndrewY;

public class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        color = "green";
        filled = true;
    }
    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }
    public Boolean isFilled() {
        return filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        color = c;
    }
    public void setFilled(boolean f) {
        filled = f;
    }
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "":"not ") + "filled.";
    }
}
