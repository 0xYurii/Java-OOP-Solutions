/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import classes.Developer;
/**
 *
 * @author mount
 */
import classes.SalesPerson;
import classes.Tester;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- SalesPerson ---");
        var salesPerson = new SalesPerson("Amine", 30, 101, 5000.0, 10000.0);
        salesPerson.printDetails();

        double bonus = salesPerson.calculateBonus();
        System.out.println("SalesPerson bonus is: " + bonus);

        salesPerson.approveLeave("Amine");
        System.out.println();

        System.out.println("--- Developer ---");
        var developer = new Developer(5, "Karim", 25, 102, 6000.0);

        developer.printDetails();

        double devBonus = developer.calculateBonus();
        System.out.println("Developer bonus is: " + devBonus);

        developer.approveLeave("Karim");
        System.out.println();

        System.out.println("--- Tester ---");
        var tester = new Tester("Nassim", 28, "FrontEnd");

        System.out.println(
            "Name: " +
                tester.getName() +
                ", Age: " +
                tester.getAge() +
                ", Project: " +
                tester.getProject()
        );

        tester.approveLeave("Nassim");
    }
}
