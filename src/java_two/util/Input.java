package java_two.util;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Input scanner = new Input();
        String getString = scanner.getString();
        System.out.println(getString);
        boolean yesNo = scanner.yesNo();
        System.out.println(yesNo);
        int getInt = scanner.getInt(1, 10);
        System.out.println(getInt);
        System.out.println(scanner.getInt());
        double getDouble = scanner.getDouble(1, 20);
        System.out.println(getDouble);

    }

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        String userInput = scanner.nextLine();
        return "'" + userInput + "'";
    }

    public boolean yesNo() {
        System.out.println("Continue? yes or no: ");
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        }else {
            return false;
        }
    }
//hasnextint for scanner
    public int getInt(int min, int max) {
        System.out.println("Please enter an integer between " + min + "-" + max);
//        boolean userInput = scanner.hasNextInt();
        int userVal = scanner.nextInt();
        if ( userVal >= min && userVal <= max) {
            return userVal;
        } else {
            System.out.println( userVal + " is not between " + min + "-" + max);
            return getInt(min, max);
        }
    }

    public int getInt() {
        System.out.println("Please enter a different integer: ");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a decimal number between " + min + "-" + max);
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            scanner.nextLine();
            return userInput;
        }
        else return getDouble(min, max);
    }

    public double getDouble() {
        System.out.println("Enter a Radius: ");
        return scanner.nextDouble();
    }
}