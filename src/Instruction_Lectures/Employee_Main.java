package Instruction_Lectures;

public class Employee_Main {
    public static void main(String[] args) {

        Employee genericEmployee = new Accountant("Bob", "Cafe");
        System.out.println(genericEmployee.work());

        Salesperson sally = new Salesperson("Sally", "Sales");
        System.out.println(sally.work());

        genericEmployee = new Manager("Ragnar", "Management");
        genericEmployee.eatLunch();

        sally.liftHeavyObject("a Boulder");

        Heavy_Lifter heavyLifter = sally;
        sally.liftHeavyObject("50 lbs");
        heavyLifter.liftHeavyObject("65 lbs");

    }
}
