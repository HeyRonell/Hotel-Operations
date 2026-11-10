import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner read = new Scanner(System.in);
//
//        System.out.println("What room type would you like to rent?");
//        String roomType = read.nextLine();
//
//        System.out.println("How many days would you like to stay?");
//        int numberOfNights = read.nextInt();
//
//        Reservation res1 = new Reservation(roomType, numberOfNights, false);
//
//
//        System.out.println(res1.getReservationTotal());
//
//        read.close();

//        Employee object testing.
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

//        Setting up a new room.
        Room room = new Room(2, 150, false, false);

        System.out.println("\n --- Room Information ---");
        System.out.println("Beds available: " + room.getNumberOfBeds());
        System.out.println("Price per night: " + room.getPrice());
        System.out.println("Availability: " + room.isAvailable());

//        Checking if the room availability changes. Assuming that both occupied and is dirty are false,
//        the room will be available.

        room.checkIn();
        System.out.println("Room Availability: " + room.isAvailable());

        room.checkOut();
        System.out.println("Room Availability: " + room.isAvailable());

        room.cleanRoom();
        System.out.println("Room Availability: " + room.isAvailable());

//        Reservation tests
        Reservation reservation = new Reservation("King", 5, true);

        System.out.println("\n---- Reservation Information ----");
        System.out.println("Selected Room Type: " + reservation.getRoomType());
        System.out.println("Number of nights requested " + reservation.getNumberOfNights());
        System.out.println("Is this a weekend visit? " + reservation.isWeekend());
        System.out.println("Price per night: $" + reservation.getPrice());
        System.out.println("Total price: $" + reservation.getReservationTotal());


    }
}