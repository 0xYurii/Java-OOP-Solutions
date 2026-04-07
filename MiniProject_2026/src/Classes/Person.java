package Classes;

public class Person {
    public int id;
    public String name;
    public String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }
}