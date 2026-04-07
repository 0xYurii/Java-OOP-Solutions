package Classes;

public class Registration {
    public int registrationId;
    public String registrationDate;
    public String status;
    public Student student;
    public Event event;

    public Registration(int registrationId, String registrationDate, String status, Student student, Event event) {
        this.registrationId = registrationId;
        this.registrationDate = registrationDate;
        this.status = status;
        this.student = student;
        this.event = event;
    }

    public void confirmRegistration() {
        // Check schedule conflict with already registered events
        for (Event e : student.registeredEvents) {
            if (e.hasConflict(event)) {
                System.out.println("Schedule conflict for " + student.name +
                        " between " + e.title + " and " + event.title);
                status = "Rejected";
                return;
            }
        }

        boolean added = event.addStudent(student);
        if (added) {
            status = "Confirmed";
            System.out.println(student.name + " registered successfully in " + event.title);
        } else {
            status = "Rejected";
        }
    }

    public void cancelRegistration() {
        if (status.equals("Confirmed")) {
            event.students.remove(student);
            student.registeredEvents.remove(event);
            status = "Cancelled";
            System.out.println("Registration of " + student.name + " in " + event.title + " has been cancelled.");
        } else {
            System.out.println("Cannot cancel a registration with status: " + status);
        }
    }

    public void displayRegistration() {
        System.out.println("Registration ID: " + registrationId);
        System.out.println("Date: " + registrationDate);
        System.out.println("Status: " + status);
        System.out.println("Student: " + student.name);
        System.out.println("Event: " + event.title);
    }
}