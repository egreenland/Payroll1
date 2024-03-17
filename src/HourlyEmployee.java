import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HourlyEmployee extends Employee implements Payable {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        wage = 35.7;
        hours = 34.9;

    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public double gethourlyPayment()
    {
        return (wage * hours);
    }

    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount();
        System.out.println("Wage: " + wage);
        System.out.println("Hours: " + hours);
        System.out.println("Hourly Pay: " + gethourlyPayment());


        return 0;
    }

    @Override
    public void writetoFile() {
        {
            try {
                File myObj = new File("Paystub.txt");
                if (myObj.createNewFile())
                    System.out.println("File has been created: " + myObj.getName());
                FileWriter myWriter = new FileWriter("Paystub.txt", true);
                myWriter.write("....... " + "HourlyEmployee" + ".........");
                myWriter.write("\n");
                myWriter.write("\n");
                myWriter.write("Wage: \t\t" + getWage());
                myWriter.write("\n");
                myWriter.write("Hours: \t\t" + getHours());
                myWriter.write("\n");


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}