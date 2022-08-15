package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student matt = new Student("Matthew");
        matt.addGrade(100);
        matt.addGrade(40);
        matt.addGrade(50);
        matt.addGrade(30);
        System.out.println(matt);
        System.out.println(matt.getGradeAverage());

    }
}
