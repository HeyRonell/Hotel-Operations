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

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
    // check in and out

    public void checkIn() {
        if (isAvailable) { // after check in, the variables will below are set to true so that they an option anymore.
            isOccupied = true;
            isDirty = true;
        }
    }
    // Separating these two since they are two different checks.
    public void checkOut() {
        isOccupied = false;
    }
    public void cleanRoom() {
        isDirty = false;
    }
}

