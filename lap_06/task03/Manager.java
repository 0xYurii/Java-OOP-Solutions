package lap_06.task03;

public class Manager extends Employee{
    double bonus;

    public Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus=bonus;
    }

    public double calculateSalary(){
        return baseSalary+bonus;
    }
}
