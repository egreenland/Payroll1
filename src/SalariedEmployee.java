import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class SalariedEmployee extends Employee implements  Payable{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        weeklySalary = 14.7;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount();
        System.out.println("Week Salary: " + weeklySalary);
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
                myWriter.write("....... " + "SalariedEmployee" + ".........");
                myWriter.write("\n");
                myWriter.write("\n");
                myWriter.write("Week Salary:\t\t" + getWeeklySalary());
                myWriter.write("\n");


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

