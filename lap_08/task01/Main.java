package lap_08.task01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        LibraryItems b1= new Book("Car6", "Amdjed", 2);
        LibraryItems b2= new Book("a Horse", "Bj", 3);
        LibraryItems b3= new Book("BJ", "Ahmed ", 6);

        LibraryItems m1 = new Magazine("jjk", "DP", 6);
        LibraryItems m2 = new Magazine("hog rider", "Fares", 4);
        LibraryItems m3 = new Magazine("The deep", "Amine", 6);

        Library l = new Library(new ArrayList<>());
        try{
            l.addItem(b1);
            l.addItem(b2);
            l.addItem(b3);
            l.addItem(m1);
            l.addItem(m2);
            l.addItem(m3);
        }catch(DuplicateItemException e){
            System.out.println("found a error: "+e.getMessage());
        }

        
        System.out.println("items before sorting");
        l.displayAllItems();

        System.out.println("items after sorting");
        l.sortItems();
        l.displayAllItems();
    }
}
