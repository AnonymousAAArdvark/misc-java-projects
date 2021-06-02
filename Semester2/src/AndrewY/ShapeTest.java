package AndrewY;

public class ShapeTest {
	public static void main(String[] args) {
		Box mybox = new Box();
		Circle mycircle = new Circle(5);
		Cube mycube = new Cube(10);
		Square mysqr = new Square(3);
		Sphere mysphere = new Sphere(4);

		System.out.println(mybox.toString());
		System.out.println(mycircle.toString());
		System.out.println(mycube.toString());
		System.out.println(mysqr.toString());
		System.out.println(mysphere.toString());

	}
}
