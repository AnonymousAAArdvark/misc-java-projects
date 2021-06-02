package AndrewY;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompanyTest {
    public static void main(String[] args) {
        ArrayList<CompanyPerson> arrEmp = new ArrayList<>();
        EasyReader comfile = new EasyReader("company.dat");
        String read = comfile.readLine();
        while(read != null) {
            arrEmp.add(new CompanyPerson(read));
            read = comfile.readLine();
        }
        Collections.sort(arrEmp);
        EasyReader workfile = new EasyReader("work.dat");
        read = workfile.readLine();
        System.out.println("Employee               Pay Rate  Dependents   Hours        Gross       Net");
        System.out.println("--------------------   --------  ----------   -----        -----       ----");
        while(read != null) {
            String[] split = read.split("\\*");
            CompanyPerson find = new CompanyPerson();
            find.setLastname(split[0]);
            int idx = Collections.binarySearch(arrEmp, find);
            int hours = Integer.parseInt(split[2]);
            double gross = Math.round(arrEmp.get(idx).getRate()*hours*100.0)/100.0;
            System.out.println(arrEmp.get(idx).toString()
                    + EasyFormat.format(""+hours, 12, 'L', 0)
                    + EasyFormat.format(""+gross, 12, 'L', 0)
                    + Math.round(Utility.pay(gross, arrEmp.get(idx).getDependents())*100.0)/100.0);
            read = workfile.readLine();
        }

    }
}
