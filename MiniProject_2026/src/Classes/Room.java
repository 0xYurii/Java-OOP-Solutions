package Classes;

public class Room {
    public String roomNumber;
    public String building;
    public int capacity;

    public Room(String roomNumber, String building, int capacity) {
        this.roomNumber = roomNumber;
        this.building = building;
        this.capacity = capacity;
    }

    public boolean canHost(int nb) {
        return capacity >= nb;
    }
}