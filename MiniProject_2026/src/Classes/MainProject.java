package Classes;



public class MainProject {
    public static void main(String[] args) {

        System.out.println("===== PARTIAL TESTS =====");
        Student sTest = new Student(1, "Ali", "ali@univ.dz", "L2", "Computer Science");
        sTest.mainTest();

        Organizer oTest = new Organizer(10, "Sara", "sara@univ.dz", "Tech Club");
        oTest.mainTest();

        System.out.println("\n===== GLOBAL TEST =====");

        Room r1 = new Room("A101", "Main Building", 2);
        Room r2 = new Room("B202", "Science Building", 50);

        Equipment projector = new Equipment(1, "Projector", 2);
        Equipment laptop = new Equipment(2, "Laptop", 5);

        Organizer org1 = new Organizer(100, "Nadia", "nadia@univ.dz", "AI Club");

        Event e1 = new Event("E01", "Java Workshop", "2026-04-10", 9, 11, 2);
        Event e2 = new Event("E02", "AI Seminar", "2026-04-10", 10, 12, 3);
        Event e3 = new Event("E03", "Robotics Session", "2026-04-11", 14, 16, 30);

        org1.createEvent(e1);
        org1.createEvent(e2);
        org1.createEvent(e3);

        e1.assignRoom(r1);
        e2.assignRoom(r2);
        e3.assignRoom(r2);

        e1.addEquipment(projector);
        e2.addEquipment(laptop);

        Student s1 = new Student(201, "Amine", "amine@univ.dz", "L3", "Computer Science");
        Student s2 = new Student(202, "Lina", "lina@univ.dz", "L2", "Mathematics");
        Student s3 = new Student(203, "Yacine", "yacine@univ.dz", "L1", "Physics");

        Registration reg1 = new Registration(1, "2026-03-23", "Pending", s1, e1);
        Registration reg2 = new Registration(2, "2026-03-23", "Pending", s2, e1);
        Registration reg3 = new Registration(3, "2026-03-23", "Pending", s3, e1);

        System.out.println("\n--- Register students in Java Workshop ---");
        reg1.confirmRegistration();
        reg2.confirmRegistration();
        reg3.confirmRegistration();

        System.out.println("\n--- Try conflicting registration for Amine ---");
        Registration reg4 = new Registration(4, "2026-03-23", "Pending", s1, e2);
        reg4.confirmRegistration();

        System.out.println("\n--- Register Amine in non-conflicting event ---");
        Registration reg5 = new Registration(5, "2026-03-23", "Pending", s1, e3);
        reg5.confirmRegistration();

        System.out.println("\n===== EVENT DETAILS =====");
        e1.displayDetails();
        e1.displayParticipants();

        System.out.println();
        e2.displayDetails();
        e2.displayParticipants();

        System.out.println();
        e3.displayDetails();
        e3.displayParticipants();

        System.out.println("\n===== ORGANIZER EVENTS =====");
        org1.displayManagedEvents();

        System.out.println("\n===== STUDENT EVENTS =====");
        s1.displayMyEvents();
        System.out.println();
        s2.displayMyEvents();
        System.out.println();
        s3.displayMyEvents();

        System.out.println("\n===== REGISTRATION STATUS =====");
        reg1.displayRegistration();
        System.out.println();
        reg4.displayRegistration();
        System.out.println();
        reg5.displayRegistration();

        System.out.println("\n===== CANCELLATION TEST =====");
        reg2.cancelRegistration();
        reg2.displayRegistration();

        System.out.println();
        e1.displayDetails();
        e1.displayParticipants();
    }
}
