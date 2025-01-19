package Tasks;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSSales, double commissionRate,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSSales,commissionRate); //initialize inherited fields from superClass
        setBaseSalary(baseSalary);
    }
}



