package AndrewY;

public class Popcorn {
	String name;
	double acres;
	double jars;
	public Popcorn() {
		name = "";
		acres = 0.;
		jars = 0.;
	}
	public String getName() {
		return name;
	}
	public double getAcres() {
		return acres;
	}
	public double getJars() {
		return jars;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAcres(double acres) {
		this.acres = acres;
	}
	public void setJars(double jars) {
		this.jars = jars;
	}
	public int calculator() {
		return (int)((jars/acres)/250+.5);
	}
	public String makeBars() {
		String bar = "";
		int value = calculator();
		for (int i = 0; i < value; i++) {
			bar = bar + "*";
		}
		if (bar.length() > 20) {
			bar = bar.substring(0, 19) + "#" + bar.substring(20);
		}
		else {
			bar = EasyFormat.format(bar, 19, 'L', 0) + "|";
		}
		return bar;
	}
}
