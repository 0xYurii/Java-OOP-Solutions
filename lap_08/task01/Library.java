package lap_08.task01;
import java.util.ArrayList;
import java.util.Collections;

public class Library {
    private ArrayList<LibraryItems> items;

    public Library(ArrayList<LibraryItems> items){
        this.items=items;
    }

    public void addItem(LibraryItems item) throws DuplicateItemException {
        for(LibraryItems i:items){
            if(i.title.equals(item.title)){
                throw new DuplicateItemException("duplicate item");
            }
        }
        items.add(item);
    }

    public void sortItems(){
        Collections.sort(items);
    }


    public void displayAllItems() {
        for (LibraryItems item : items) {
            item.displayInfo();
        }
    }
}

