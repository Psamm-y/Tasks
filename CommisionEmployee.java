package Tasks;

public class CommisionEmployee {
    private String firstname;



    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commisionRate;
    public CommisionEmployee(String firstname, String lastName, String socialSecurityNumber, double grossSales, double commisionRate) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
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
        if (grossSales <0.0){
            throw new IllegalArgumentException("Gross Sales must be greater or equal to 0");
        }
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        if(commisionRate<0.0 || commisionRate>1.0){
            throw new IllegalArgumentException("Commision Rate must be between 0 and 1");
        }
        this.commisionRate = commisionRate;
    }

    public double earnings(){
        return grossSales*commisionRate;
    }
    public static void main(String [] args){

    }
}

