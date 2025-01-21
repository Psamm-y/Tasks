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

    public double earnings(){
        return baseSalary + super.earnings();
    }
    public String toString(){
        return super.toString()+
                "\nBase Salary: "+ baseSalary+"\n"+
                "Earnings: "+earnings();
    }

    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSSales, double commissionRate,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSSales,commissionRate); //initialize inherited fields from superClass
        setBaseSalary(baseSalary);
    }

    public static void main(String[] args){
        BasePlusCommissionEmployee baseSalaryEmployee= null;
        try{
            baseSalaryEmployee=new BasePlusCommissionEmployee("Samuel","Ampadu","12132-13",23,0.7,100);
            System.out.println(baseSalaryEmployee.toString());
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}



