package lap_04.task03;

public class Main {
    public static void main(String[] args) {
        StudyRoom room = new StudyRoom("Room-A", 6);

        boolean r1 = room.reserve("Alice", new TimeSlot(2, 9, 11));   // expect true
        boolean r2 = room.reserve("Bob", new TimeSlot(2, 10, 12));    // expect false (overlap)
        boolean r3 = room.reserve("Cara", new TimeSlot(2, 11, 13));   // expect true (touching boundary)

        System.out.println("Reserve Alice 9-11: " + r1);
        System.out.println("Reserve Bob 10-12 (overlap): " + r2);
        System.out.println("Reserve Cara 11-13: " + r3);

        boolean c1 = room.cancel("Alice", new TimeSlot(2, 9, 11));    // expect true
        boolean r4 = room.reserve("Alice", new TimeSlot(2, 9, 11));   // expect true (re-add)

        System.out.println("Cancel Alice 9-11: " + c1);
        System.out.println("Re-add Alice 9-11: " + r4);

        System.out.println("\nDay 2 schedule:");
        room.printSchedule(2);
    }
}