package Classes;

import java.util.ArrayList;

public class Event {
    public String code;
    public String title;
    public String date;
    public int startHour;
    public int endHour;
    public int maxParticipants;
    public Room room;
    public Organizer organizer;
    public ArrayList<Student> students;
    public ArrayList<Equipment> equipments;

    public Event(String code, String title, String date, int startHour, int endHour, int maxParticipants) {
        this.code = code;
        this.title = title;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
        this.maxParticipants = maxParticipants;
        this.students = new ArrayList<>();
        this.equipments = new ArrayList<>();
    }

    public void assignRoom(Room r) {
        this.room = r;
    }

    public void addEquipment(Equipment eq) {
        equipments.add(eq);
    }

    public boolean addStudent(Student s) {
        if (isFull()) {
            System.out.println("Event " + title + " is full.");
            return false;
        }
        students.add(s);
        s.registerToEvent(this);
        return true;
    }

    public boolean isFull() {
        return students.size() >= maxParticipants;
    }

    public boolean hasConflict(Event other) {
        if (!this.date.equals(other.date)) return false;
        return this.startHour < other.endHour && other.startHour < this.endHour;
    }

    public void displayDetails() {
        System.out.println("Event Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Date: " + date);
        System.out.println("Time: " + startHour + " - " + endHour);
        System.out.println("Max Participants: " + maxParticipants);
        System.out.println("Current Participants: " + students.size());
        System.out.println("Remaining Places: " + (maxParticipants - students.size()));
        if (room != null)
            System.out.println("Room: " + room.roomNumber + " (" + room.building + ")");
    }

    public void displayParticipants() {
        System.out.println("Participants in " + title + ":");
        if (students.isEmpty()) {
            System.out.println("  No participants yet.");
        } else {
            for (Student s : students) {
                System.out.println("  - " + s.name + " (" + s.email + ")");
            }
        }
    }
}