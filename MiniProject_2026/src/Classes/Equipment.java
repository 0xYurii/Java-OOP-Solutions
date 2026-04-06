package Classes;

public class Equipment {
    public int id;
    public String name;
    public int quantityAvailable;

    public Equipment(int id, String name, int quantityAvailable) {
        this.id = id;
        this.name = name;
        this.quantityAvailable = quantityAvailable;
    }

    public boolean isAvailable(int qty) {
        return quantityAvailable >= qty;
    }
}