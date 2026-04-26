package lap_06.task01;

public class Rectangle implements Shape{
    double width;
    double height;

    public Rectangle(double w, double h){
        this.height=h;
        this.width=w;
    }

    public double calculateArea(){
        return (width*height);
    }

    public void displayInfo(){
        System.out.println("area is: "+calculateArea());
    }
    
}