package Instruction_Lectures;

public abstract class Employee {
    protected String name;
    protected String department;

    public abstract String work();

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void eatLunch() {
        System.out.println(this.name + " eats lunch");
//        return this.name + " eats lunch";
    }
}
