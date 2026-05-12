package hotel;
public class Main {
    public static void main(String[] args) {
        Room room = new Room(200);
        Guest guest1 = new Guest("Jose de Mayo", 1);
//        Guest guest2 = new Guest("Jose Kenobi", 1);
//        Guest guest2 = new Guest("Jose Kenobi", 2);

        if(!room.isOccupied()) {
            boolean success = room.checkIn(guest1);
            if (!success) {
                System.err.println("Checkin failed.");
            }
        }

        if( room.getGuest() == guest1 ) {
            System.out.println("Object check: Jose is in the room");
        }

        // We could also check IDs - IF we make sure every guest has a unique ID
        // But why?  Isn't this extra work?
        if( room.getGuest().getId() == guest1.getId() ) {
            System.out.println("ID check: Jose is in the room");
        }

    }
}
