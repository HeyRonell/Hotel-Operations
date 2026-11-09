public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public double totalPay() {
        return hoursWorked * payRate;
    }

    public double getRegularHours() {
        return hoursWorked;
        }

    public double getOvertimeHours() {
        double overTimeHours = 0;
        if (hoursWorked > 40) {
           overTimeHours = hoursWorked - 40;
        }
        return overTimeHours;
    }
}
