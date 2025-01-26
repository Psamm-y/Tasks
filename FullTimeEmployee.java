package Tasks;

public class FullTimeEmployee extends Employee{

    private double salary;
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public FullTimeEmployee(String name, String employeeId,double salary) {
        super(name, employeeId);
        this.salary= salary;
    }

    public void calculatePay() {
        System.out.println("Full Time Employee Pay: "+ getSalary());
    }

    public static void main(String[] args){
        //FullTimeEmployee object using the three-argument constructor.
        FullTimeEmployee ftemployee=new FullTimeEmployee("Samuel","203984",420.00);
        System.out.println("Employee Name: "+ftemployee.getName());
        System.out.println("Employee Id: "+ftemployee.getEmployeeId());
        System.out.println("Employee Salary: "+ftemployee.getSalary());

        ftemployee.calculatePay();

        //testing different salary values to calculate pay
        try{
            ftemployee.setSalary(234444);
        }catch (IllegalArgumentException e){
            System.out.println(e.getCause());
        }
    }
}
