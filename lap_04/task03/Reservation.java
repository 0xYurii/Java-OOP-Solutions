package lap_04.task03;

public class Reservation {

    String studentName;
    TimeSlot slot;

    public Reservation(
        String studentName,
        int day,
        int startHour,
        int endHour
    ) {
        this.studentName = studentName;
        this.slot = new TimeSlot(day, startHour, endHour);
    }

    public String summary() {
        String state =
            studentName +
            ", Day" +
            slot.day +
            ", " +
            slot.startHour +
            " to " +
            slot.endHour;
        return state;
    }
}
