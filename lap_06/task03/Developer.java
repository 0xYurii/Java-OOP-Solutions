package lap_06.task03;

public class Developer extends Employee{
    int overtimeHours;
    double hourRate;

    public Developer(String name, double baseSalary, int overtimeHours, double hourRate){
        super(name, baseSalary);
        this.overtimeHours=overtimeHours;
        this.hourRate=hourRate;
    }

    public double calculateSalary(){
        return (baseSalary +(overtimeHours*hourRate));
    }
}
