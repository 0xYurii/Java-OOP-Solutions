package lap_08.task02;

public class StorageBox <T>{
    private T item;
    public StorageBox(T item){
        this.item=item;
    }
    public void setItem(T val){
        item=val;
    }
    
    public T getItem(T val){
        return this.item;
    }

    public void displayItem(){
        System.out.println(item);
    }
}
