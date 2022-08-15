package Instruction_Lectures;

public class Salesperson extends Employee implements Heavy_Lifter{
    public Salesperson(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return this.name + " sells stuff";
    }

    @Override
    public void liftHeavyObject(String heavyObject) {
        System.out.println(this.name + " somehow manages to lift " + heavyObject);
    }
}
