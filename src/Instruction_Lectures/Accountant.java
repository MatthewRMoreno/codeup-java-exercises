package Instruction_Lectures;

public class Accountant extends Employee{

    public Accountant(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return this.name + " counts beans";
    }
}
