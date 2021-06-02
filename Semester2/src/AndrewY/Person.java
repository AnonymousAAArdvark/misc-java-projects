package AndrewY;

public class Person implements Comparable<Person> {
	private String last;
	private String first;
	private boolean attended;
	public Person(String s) {
		String [] arr = s.split(", ");
		last = arr[0];
		first = arr[1];
		attended = false;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public boolean isAttended() {
		return attended;
	}
	public void setAttended(boolean attended) {
		this.attended = attended;
	}
	public int compareTo(Person obj) {
		int answer = (last+first).compareToIgnoreCase(obj.last + obj.first);
		if(answer == 0) 
			return 0;
		else if (answer > 0) 
			return 1;
		else 
			return -1;
	}
	public String toString() {
		return last + ", " + first;
	}
}
