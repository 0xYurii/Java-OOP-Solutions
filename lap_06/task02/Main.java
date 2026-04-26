package lap_06.task02;

public class Main {
    public static void main (String[] args){
        Calculator calc= new Calculator();

        System.out.println(calc.add(2,3));
        System.out.println(calc.add(2.54, 4.1));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.multiply(4, 5));
        System.out.println(calc.multiply(2.5, 3.0));
        
    }
}
