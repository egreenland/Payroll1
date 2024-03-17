
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CommissionEmployee extends Employee implements Payable{

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber){
        super(firstName,lastName,socialSecurityNumber);
        grossSales = 14.6;
        commissionRate = 17.9;
    }


    public void setcommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getcommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommission(){
        return grossSales * commissionRate;
    }


    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount();
        System.out.println("Gross Sales: " + grossSales);
        System.out.println("commission Rate: " + commissionRate);
        System.out.println("Commission: " + getCommission());
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
                myWriter.write("....... " + "CommissionEmployee" + ".........");
                myWriter.write("\n");
                myWriter.write("\n");
                myWriter.write("Gross Sales: \t\t" + getGrossSales());
                myWriter.write("\n");
                myWriter.write("Commission Rate: \t\t" + getcommissionRate());
                myWriter.write("\n");


            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

    }}