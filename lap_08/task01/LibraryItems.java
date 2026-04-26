package lap_08.task01;

public abstract class LibraryItems implements Comparable<LibraryItems>{
    protected String title;
    protected String author;
    protected int year;

    public LibraryItems(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    public abstract void displayInfo();

    @Override
    public int compareTo(LibraryItems LibraryComparedTo){
        int res=0;
        if(this.year<LibraryComparedTo.year) res=1;
        if(this.year>LibraryComparedTo.year) res=-1;
        if(this.year==LibraryComparedTo.year) res=0;
        return res;
    }
}
