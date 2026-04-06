package Classes;

import java.util.ArrayList;

public class Student extends Person {
    public String level;
    public String department;
    public ArrayList<Event> registeredEvents;

    public Student(int id, String name, String email, String level, String department) {
        super(id, name, email);
        this.level = level;
        this.department = department;
        this.registeredEvents = new ArrayList<>();
    }

    public boolean registerToEvent(Event e) {
        registeredEvents.add(e);
        return true;
    }

    public void displayMyEvents() {
        System.out.println("Events for " + name + ":");
        if (registeredEvents.isEmpty()) {
            System.out.println("  No events registered.");
        } else {
            for (Event e : registeredEvents) {
                System.out.println("  - " + e.title + " on " + e.date);
            }
        }
    }

    public void mainTest() {
        displayInfo();
        System.out.println("Level: " + level + ", Department: " + department);
    }
}