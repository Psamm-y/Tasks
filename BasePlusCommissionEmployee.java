package Tasks;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public double getBaseSalary() {

        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        if(baseSalary<=0){
            throw new IllegalArgumentException("Base Salary must be greater than 0");
        }
        this.baseSalary = baseSalary;
    }



    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSSales, double commissionRate,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSSales,commissionRate); //initialize inherited fields from superClass
        setBaseSalary(baseSalary);
    }
}



