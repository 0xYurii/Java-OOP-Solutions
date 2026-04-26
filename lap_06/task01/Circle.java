package lap_06.task01;
import lap_06.task01.Circle;

public class Circle implements Shape {
    double raduis;
    public Circle(double raduis){
        this.raduis=raduis;
    }
    
    public double calculateArea(){
        return (3.14* raduis*raduis);
    }

    public void displayInfo(){
        System.out.println("area: "+calculateArea());
    }
}