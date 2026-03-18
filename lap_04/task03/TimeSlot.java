package lap_04.task03;

public class TimeSlot {

    int day;
    int startHour;
    int endHour;

    public TimeSlot(int day, int startHour, int endHour) {
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("day must be in range 1..7");
        }
        if (startHour < 0 || startHour > 23) {
            throw new IllegalArgumentException("startHour must be in range 0..23");
        }
        if (endHour < 1 || endHour > 24) {
            throw new IllegalArgumentException("endHour must be in range 1..24");
        }
        if (startHour >= endHour) {
            throw new IllegalArgumentException("startHour must be less than endHour");
        }
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public boolean overlaps(TimeSlot other) {
        return this.day == other.day
            && this.startHour < other.endHour
            && this.endHour > other.startHour;
    }
}
