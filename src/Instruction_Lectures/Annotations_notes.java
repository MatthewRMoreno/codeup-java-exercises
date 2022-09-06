package Instruction_Lectures;

public class Annotations_notes {
    @Deprecated
    private int age;


    @Override
    public String toString() {
        return "AnnotationNotes{}";
    }

    public static void main(String[] args) {
        Annotations_notes a = new Annotations_notes();
        a.age = 21;
        System.out.println(a.age);
    }
}
