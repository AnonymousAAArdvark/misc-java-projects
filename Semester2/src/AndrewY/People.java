package AndrewY;

public class People implements Comparable<People> {
	private String ID, first, last, phone;
	public People() {
		ID = null;
		first = null;
		last = null;
		phone = null;
	}
	String getID() {
		return ID;
	}
	String getFirst() {
		return first;
	}
	String getLast() {
		return last;
	}
	String getPhone() {
		return phone;
	}
	void setID(String i) {
		ID = i;
	}
	void setFirst(String f)  {
		first = f;
	}
	void setLast(String l)  {
		last = l;
	}
	void setPhone(String p) {
		phone = p;
	}
	public int compareTo(People aObject) {
		int answer = 0;
		if((last+first).compareToIgnoreCase(aObject.last+aObject.first) == 0)
			answer = 0;
		else if((last+first).compareToIgnoreCase(aObject.last+aObject.first) > 0)
			answer = 1;
		else if((last+first).compareToIgnoreCase(aObject.last+aObject.first) < 0) 
			answer = -1;
		return answer;
	}

}
