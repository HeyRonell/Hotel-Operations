public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, double price, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Room(String roomType, int numberOfNights) {
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        if (!isOccupied && !isDirty) {
            isAvailable = true;
            return isAvailable;
        } else {
            isAvailable = false;
            return isAvailable;
        }
    }
}

