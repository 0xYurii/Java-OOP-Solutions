package Classes;

import java.util.ArrayList;

public class Organizer extends Person {
    public String clubName;
    public ArrayList<Event> managedEvents;

    public Organizer(int id, String name, String email, String clubName) {
        super(id, name, email);
        this.clubName = clubName;
        this.managedEvents = new ArrayList<>();
    }

    public void createEvent(Event e) {
        e.organizer = this;
        managedEvents.add(e);
    }

    public void displayManagedEvents() {
        System.out.println("Events managed by " + name + " (" + clubName + "):");
        for (Event e : managedEvents) {
            System.out.println("  - [" + e.code + "] " + e.title + " on " + e.date);
        }
    }

    public void mainTest() {
        displayInfo();
        System.out.println("Club: " + clubName);
    }
}