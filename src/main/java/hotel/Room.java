package hotel;

public class Room {
    private int roomNumber;
    private boolean isClean = true;
    private Guest guest;

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isClean() {
        return isClean;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isOccupied() {

        return guest != null;
    }

    public boolean checkIn(Guest guest) {
        if(guest == null) {
            throw new IllegalArgumentException("Guest must not be null");
        }

        if(!this.isClean) {
            return false;
        }

        if (isOccupied()) {
            return false;
        }

        this.guest = guest;

        return true;
    }
}
