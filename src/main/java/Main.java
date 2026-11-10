import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("What room type would you like to rent?");
        String roomType = read.nextLine();

        System.out.println("How many days would you like to stay?");
        int numberOfNights = read.nextInt();

        Reservation res1 = new Reservation(roomType, numberOfNights, false);


        System.out.println(res1.getReservationTotal());

        read.close();


        Employee employee = new Employee(24, "Don Medina",
                "Server", 40, 29.25);

//    Shift 1
        employee.clockIn(8);
        employee.clockOut(24);

//    Shift 2
        employee.clockIn(8);
        employee.clockOut(24);


        System.out.println("\n=== Employee ===");
        System.out.println("Employee Id: " + employee.getEmployeeID());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Regular Hours: " + employee.getHoursWorked());
        System.out.println("Overtime: " + employee.getOvertimeHours());
        System.out.println("Total Pay: $" + employee.getTotalPay());
    }

    public void display(String roomType, int numberOfNights) {
        System.out.printf("Room Type: %s | Number of nights: %d",
                roomType, numberOfNights);
    }
}

