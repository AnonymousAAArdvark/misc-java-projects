package AndrewY;

public class Premiums implements Comparable<Premiums> {
	private final int age;
	private final int premium;
	public Premiums(String s) {
		String arr[] = s.split(" ");
		age = Integer.parseInt(arr[0]);
		premium = Integer.parseInt(arr[1]);
	}
	public int getAge() {
		return age;
	}
	public int getPrem() {
		return premium;
	}
	public int compareTo(Premiums obj) {
		if(age > obj.getAge())
			return 1;
		else if(age < obj.getAge())
			return -1;
		else
			return 0;
	}
}
