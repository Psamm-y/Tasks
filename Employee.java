package Tasks;

public abstract class Employee {

    private String name;
    private String employeeId;

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Employee(String name, String employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }
    public abstract void calculatePay();

}
