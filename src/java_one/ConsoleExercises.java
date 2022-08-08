package java_one;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s.%n" ,pi);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //Enter an integer
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("The number you entered is: " + userInput +".");
        scanner.nextLine();

        //Three Words
        System.out.println("Please enter 3 words: ");
        System.out.println("First: ");
        String first = scanner.next();

        System.out.println("Second: ");
        String second = scanner.next();

        System.out.println("Third: ");
        String third = scanner.next();

        System.out.println("The first word you entered is " + first + ". The second word is " + second + ". The last word is " + third);
        scanner.nextLine();

        //Enter a sentence
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You have just entered the sentence: " + sentence);
//        scanner.nextLine();

        //Size of codeup classroom
        System.out.println("Enter the length and the width of the Codeup classroom below: ");
        System.out.println("length: ");
        String length = scanner.nextLine();
        System.out.println("width: ");
        String width = scanner.nextLine();
        int perimeter = (Integer.parseInt(width) * 2) + (Integer.parseInt(length) * 2);
        int area = (Integer.parseInt(width) * Integer.parseInt(length));
        System.out.println("The perimeter of the classroom is " + perimeter);
        System.out.println("The area of the classroom is " + area);
        scanner.useDelimiter("\n");
        scanner.nextLine();

        //Using int for the classroom problem
        System.out.println("Enter the length and width of the classroom again below:");
        System.out.println("Length: ");
        int length2 = scanner.nextInt();
        System.out.println("Width: ");
        int width2 = scanner.nextInt();
        int area2 = (length2 * width2);
        int perimeter2 = ((length2 * 2) + (width2 * 2));
        System.out.println("Perimeter: " + perimeter2);
        System.out.println("Area: " + area2);
    }
}
