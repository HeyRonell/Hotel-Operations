public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    double nightlyPrice = 0;

    public Reservation(String roomType, int numberOfNights,
                       boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king").trim()) {
            price = 139.00;
        }
        else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        } else {
            System.out.println("Please select a valid option.");
        }
        if (isWeekend) {
            price *= 1.1;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }




}
