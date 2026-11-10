public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private int startTime;

    public Employee(int employeeID, String name, String department, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate);
    }
}
