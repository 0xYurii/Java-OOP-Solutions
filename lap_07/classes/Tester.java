/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.Manager;

/**
 *
 * @author mount
 */
public class Tester implements Manager {

    private String name;
    private int age;
    private String project;

    public Tester(String name, int age, String project) {
        this.name = name;
        this.age = age;
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     *
     * @param employeeName
     */
    @Override
    public void approveLeave(String employeeName) {
        System.out.println("Leave approved for Tester " + employeeName);
    }
}
