package AndrewY;

public class PCustomer implements Comparable<PCustomer> {
	private String name;
	private int age;
	public PCustomer(String s) {
		String arr[] = s.split("\\*");
		name = arr[0];
		age = Integer.parseInt(arr[1]);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int compareTo(PCustomer obj) {
		int res = name.compareTo(obj.getName());
		if(res > 0)
			return 1;
		else if(res < 0) 
			return -1;
		return 0;
	}

}
