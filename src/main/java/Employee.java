import java.time.*;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // clocking in for the day
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
        return Math.min(hoursWorked, 40); // will help us acquire hours up to 40 regular hours
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0); // to calculate the hours minus regular hours.
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate);
    }

    public void clockIn(int time) {
        startTime = time;
    }

    public void clockIn() {
        LocalDateTime now = LocalDateTime.now();
    }
    public void clockOut(int time) {
        int hoursWorkedToday = time - startTime;
        hoursWorked += hoursWorkedToday;
    }
    public void clockOut() {
        LocalDateTime now = LocalDateTime.now();
        int endTime = now.getHour();
        int hoursWorkedToday = endTime - startTime;
        hoursWorked += hoursWorkedToday;
        System.out.println("You clockced out at " + now.getHour() + ":" + now.getMinute());
    }
}
