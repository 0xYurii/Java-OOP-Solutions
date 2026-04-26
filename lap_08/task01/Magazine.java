package lap_08.task01;

public class Magazine extends LibraryItems{
    public Magazine(String title,String author,int year){
        super(title, author, year);
    }

    public void displayInfo(){
        System.out.println("Type magazine: title: "+title+", author: "+author+", year: "+year);
    }
}

