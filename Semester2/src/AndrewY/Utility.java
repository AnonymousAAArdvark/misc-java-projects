package AndrewY;

public class Utility {
    public static double pay(double gross, int dep) {
        return (100*gross - gross * (20-dep))/100;
    }
}
