package Tasks;

public class FullTimeEmployee extends Employee{

    private double salary;
    public double getSalary() {
        return salary;
    }

    public FullTimeEmployee(String name, String employeeId,double salary) {
        super(name, employeeId);
        this.salary= salary;
    }

    public double calculatePay() {
        return 0;
    }
}
