package Instruction_Lectures;

public class Manager extends Employee{
    public Manager(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return this.name + " bosses someone around.";
    }
}
