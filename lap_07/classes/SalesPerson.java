/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author mount
 */
import abstractclasses.Employee;
import interfaces.Manager;

public class SalesPerson extends Employee implements Manager {

    private double salesAmount;

    public SalesPerson(
        String name,
        int age,
        int employeeId,
        double salary,
        double salesAmount
    ) {
        super(name, age, employeeId, salary);
        this.salesAmount = salesAmount;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    /**
     *
     * @return
     */
    @Override
    public double calculateBonus() {
        return salesAmount * 0.1;
    }

    /**
     *
     * @param employeeName
     */
    @Override
    public void approveLeave(String employeeName) {
        System.out.println("Leave approved for employee " + employeeName);
    }
}
