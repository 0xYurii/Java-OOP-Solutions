package lap_06.task03;
import java.util.ArrayList; 

public class Main {
    public static void main(String[] aStrings){
        Employee m= new Manager("Ahmed", 5000, 200);
        Employee d= new Developer("Younes", 6000, 5, 3);

        ArrayList<Employee> employees=new ArrayList<Employee>();

        employees.add(m);
        employees.add(d);

        for(int i=0;i<employees.size();i++){
            employees.get(i).displayInfo();
        }
    }
}
