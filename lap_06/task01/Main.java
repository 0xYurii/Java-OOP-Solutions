package lap_06.task01;
import java.util.ArrayList; 

public class Main {

    public static void main (String[] args ){
        Shape c= new Circle(3);
        Shape r= new Rectangle(3.2, 6);

        ArrayList<Shape> shapes=new ArrayList<Shape>();

        shapes.add(c);
        shapes.add(r);

        for(int i=0;i<shapes.size();i++){
           shapes.get(i).displayInfo(); 
        }
    }

    

}