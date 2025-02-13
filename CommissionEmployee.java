package Tasks;

public class CommissionEmployee {
    private String firstname;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    //Default constructor
    public CommissionEmployee(){};//Overloading

    //constructor with parameters
    public CommissionEmployee(String firstname, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        setGrossSales(grossSales);
        setCommisionRate(commissionRate);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross Sales must be greater or equal to 0");
        }
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commissionRate;
    }

    public void setCommisionRate(double commissionRate) {
        if (commissionRate < 0.0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("Commision Rate must be between 0 and 1");
        }
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return grossSales * commissionRate;

    }


    //Override toString method
    @Override
    public String toString() {
        return "Employee{\n" +
                "First name: " + firstname + "\n" +
                "Last name: " + lastName + "\n" +
                "Social Security Number: " + socialSecurityNumber + "\n" +
                "Gross sales: " + grossSales + "\n" +
                "Commission rate: " + commissionRate + "\n" +
                "}\n";
    }

    public static void main(String[] args) {
        CommissionEmployee employee= null;
        try{
             employee = new CommissionEmployee("Samuel", "Ampadu", "126-553-48", 2, 0.3);
            System.out.println(employee.toString());
        }catch(IllegalArgumentException m){
            System.out.println("Error: "+m.getMessage());
            return;
        };

        try{
            employee.setGrossSales(18);
        }catch (IllegalArgumentException m){
            System.out.println("Error: "+m.getMessage());
        }

        System.out.println(employee.earnings()); //employee earnings
    }
}

