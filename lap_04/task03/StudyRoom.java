package lap_04.task03;

import java.util.ArrayList;

public class StudyRoom {

    String roomName;
    int size;
    ArrayList<Reservation> reservations;

    public StudyRoom(String roomName, int size) {
        this.roomName = roomName;
        this.size = size;
        this.reservations = new ArrayList<Reservation>();
    }

    public boolean reserve(String student, TimeSlot slot) {
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).slot.overlaps(slot)) {
                return false;
            }
        }
        reservations.add(
            new Reservation(student, slot.day, slot.startHour, slot.endHour)
        );
        return true;
    }

    public boolean cancel(String student, TimeSlot slot) {
        for (int i = 0; i < reservations.size(); i++) {
            if (
                reservations.get(i).studentName.equals(student) &&
                reservations.get(i).slot.day == slot.day &&
                reservations.get(i).slot.startHour == slot.startHour &&
                reservations.get(i).slot.endHour == slot.endHour
            ) {
                reservations.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printSchedule(int day) {
        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).slot.day == day) {
                System.out.println(reservations.get(i).summary());
            }
        }
    }
}
