package java_one;

import java.util.Scanner;

public class ControlFlowExercises {
    public static <function> void main(String[] args) {
        //While Loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
        //Do-while Loop
//        int i =0;
//        do {
//            System.out.println(i);
//            i+=2;
//        }
//        while (i <= 100);{
//        }
        //do-while count backwards
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5 ;
//        }
//        while (i >= -10);
        //do-while square loop
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while (i < 1000000);
        //For-Loops count to 15
//        for (int j = 5; j <= 15; j++) {
//            System.out.println(j);
//        }
        //for-loop count by 2's to 100
//        for (int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }
        //for-loop counting backwards from 100
//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }
        //for loop squaring each number
//        for (long i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }
        //Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i%3==0 && i%5==0) {
//                System.out.println("FizzBuzz");
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//            }else if (i%3==0) {
//                System.out.println("Fizz");
//            }else
//                System.out.println(i);
//        }
        //Adding in a scanner
        Scanner scanner = new Scanner(System.in);
        //Making table from integer
        boolean confirmation;
        do {
            System.out.println("Please enter an integer: ");
            int userValue = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed ");
            System.out.println("------ | ------- | -----");


            for (int i = 1; i <= userValue; i++) {
                int square = (i * i);
                int cube = (i * square);
                System.out.println(i + "      | " + square + "       | " + cube);
            }
            System.out.print("Continue? [y/N] ");
            String userInput = scanner.next();
            confirmation = userInput.equals("y");
        }while(confirmation);
        //Convert number grade to letter grade
        boolean confirmation2;
        do {
            System.out.println("Enter your current grade: ");
            System.out.println("Grade: ");
            long grade = scanner.nextInt();
            if (grade >= 98) {
                System.out.println("You currently have an A+! Keep up the great work");
            } else if (grade >= 88) {
                System.out.println("You currently have an A! Outstanding Job :)");
            } else if (grade >= 80) {
                System.out.println("You currently have a B! Great Work :)");
            } else if (grade >= 67) {
                System.out.println("You currently have a C");
            } else if (grade >= 60) {
                System.out.println("You currently have D :(");
            } else
                System.out.println("You currently have an F :,(");

            System.out.print("Would you like to continue? [y/n] ");
            String userInput = scanner.next();
            confirmation2 = userInput.equals("y");
        }while (confirmation2);
    }
}

