package grades;

import java_one.Bob;
import java_two.util.Input;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();

        Student Thomas = new Student("Thomas");
        Thomas.addGrade(95);
        Thomas.addGrade(75);
        Thomas.addGrade(80);
        students.put("ThomasTheTrain", Thomas);
        Student Ricky = new Student("Ricky");
        Ricky.addGrade(100);
        Ricky.addGrade(98);
        Ricky.addGrade(98);
        students.put("RickyRamseyRamirez", Ricky);
        Student Bob = new Student("Bob");
        Bob.addGrade(72);
        Bob.addGrade(63);
        Bob.addGrade(80);
        students.put("BobTheBuilder", Bob);
        Student Chris = new Student("Chris");
        Chris.addGrade(98);
        Chris.addGrade(65);
        Chris.addGrade(82);
        students.put("ChrisCrossAppleSauce", Chris);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students: ");
        Boolean userValue;
//        String [] keys = students.keySet().toArray(new String[0]);
        do {
            //Iterates through the keyset and outputs GitHub usernames
            for (String key : students.keySet()) {
                System.out.print("|" + key + "|  ");
            }
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            String userInput = input.getString();
            //if UserInput is not a GitHub username
            if (!students.containsKey(userInput)) {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput);
            } else {
                //if user input is a GitHub username output the info
                System.out.println("Name: " + students.get(userInput).getName());
                System.out.println("GitHub username: " + userInput);
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
            }

            System.out.println("Would you like to see another student?");
            userValue = input.yesNo();
//            if(!userValue) {
//                break;
//            }
        }while (userValue);
    }
}
