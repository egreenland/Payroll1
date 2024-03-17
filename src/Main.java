/*Jaleel Forsythe ID2017002533
  Mikado Meikle ID 201700955
  Errol GreenlandID 2017001595
  Brian Davis ID 2017001804
  Nicholas Miller 2101010751*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee("Nicholas","Miller","005-92-XXXX");
        Invoice i = new Invoice("3","Account",4,3.5);

        e.getPaymentAmount();
        i.getPaymentAmount();


        HourlyEmployee h = new HourlyEmployee("Peter","Samuel","305-45-XXXX");
        double wage = h.getWage();
        double hours = h.getHours();
        System.out.println("Hourly Pay: " + h.gethourlyPayment());
        h.writetoFile();


        SalariedEmployee s = new SalariedEmployee("Zeus", "Storm","126-86-XXXX");
        double weeklySalary = s.getWeeklySalary();
        System.out.println("Weekly Salary: " + weeklySalary);
        s.writetoFile();

        CommissionEmployee c = new CommissionEmployee("Adam", "Steven","455-13-XXXX");
        double grossSales = c.getGrossSales();
        double commissionRate = c.getcommissionRate();
        System.out.println("Gross Sales: " + grossSales);
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Commission: " + c.getCommission());
        c.writetoFile();
    }

}