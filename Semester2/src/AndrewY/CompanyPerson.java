package AndrewY;

public class CompanyPerson implements Comparable<CompanyPerson> {
    private String lastname;
    private String firstname;
    private double rate;
    private int dependents;

    public CompanyPerson() {
        lastname = "";
        firstname = "";
        rate = 0.0;
        dependents = 0;
    }

    public CompanyPerson(String s) {
        String[] split = s.split("\\*");
        lastname = split[0];
        firstname = split[1];
        rate = Double.parseDouble(split[2]);
        dependents = Integer.parseInt(split[3]);
    }

    public String toString() {
        return EasyFormat.format(lastname + " " + firstname, 25, 'L', 0) +
                EasyFormat.format(""+rate, 12, 'L', 0) +
                EasyFormat.format(""+dependents, 10, 'L', 0);
    }

    public int compareTo(CompanyPerson obj) {
        int ret = lastname.compareTo(obj.getLastname());
        return ret;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getDependents() {
        return dependents;
    }

    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

}
