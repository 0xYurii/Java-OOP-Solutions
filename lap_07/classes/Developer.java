package classes;

import abstractclasses.Employee;


public class Developer extends Employee {

    private int experince;

    public Developer(
        int experince,
        String name,
        int age,
        int employeeId,
        double salary
    ) {
        super(name, age, employeeId, salary);
        this.experince = experince;
    }

    public int getExperince() {
        return experince;
    }

    public void setExperince(int experince) {
        this.experince = experince;
    }

    public void approveLeave(String employeeName) {
        System.out.println("Leave approved for developer " + employeeName);
    }

    /**
     *
     * @return
     */
    @Override
    public double calculateBonus() {
        return salary * (experince * 0.01);
    }
}
