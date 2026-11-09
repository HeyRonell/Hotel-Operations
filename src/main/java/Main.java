import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("What room type would you like to rent?");
        String roomType = read.nextLine();

        System.out.println("How many days would you like to stay?");
        int numberOfNights = read.nextInt();

        read.nextLine();

        Reservation res1 = new Reservation(roomType, numberOfNights, false);
        Room room101 = new Room(roomType, numberOfNights);


        System.out.println();



    }

    public void display(String roomType, int numberOfNights) {
        System.out.printf("Room Type: %s | Number of nights: %d",
                roomType, numberOfNights);
    }
}

