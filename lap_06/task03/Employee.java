package lap_06.task03;

public abstract class Employee {
    public String name;
    public double baseSalary;

    public Employee(String name,double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public abstract double calculateSalary();

    public void displayInfo(){
        System.out.println("name: "+name+", base salary: "+baseSalary);
    }
}