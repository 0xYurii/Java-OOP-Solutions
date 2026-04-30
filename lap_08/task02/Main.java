package lap_08.task02;

import lap_08.task01.Book; 

public class Main {
    public static void main(String[] args){
        StorageBox<String> s = new StorageBox<String>("Cool");
        StorageBox<Integer> i = new StorageBox<Integer>(6);
        StorageBox<Book> b = new StorageBox<Book>(new Book("the prince", "Go", 6));
        
        s.displayItem();
        i.displayItem();
        b.toString();
        b.displayItem();
    }
}