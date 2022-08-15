package grades;

import java.util.ArrayList;

public class Student {
    private String name;

    private ArrayList<Integer> grades;

    @Override
    public String toString() {
        return name + grades;
    }

    //constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    };

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for (int i = 0; i < grades.size(); i++)
            total += grades.get(i);
        int average = total/grades.size();
        return average;
    }


    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
