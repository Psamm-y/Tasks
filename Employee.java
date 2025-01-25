package Tasks;

public abstract class Employee {
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    private String name;
    private String employeeId;

    public Employee(String name, String employeeId){
        this.name=name;
    }
    public abstract double calculatePay();

}
