package lap_08.task01;

public class Book extends LibraryItems{
    public Book(String title,String author,int year){
        super(title, author, year);
    }

    public void displayInfo(){
        System.out.println("Type book: title: "+title+", author: "+author+", year: "+year);
    }
}
