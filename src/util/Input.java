package util;
import java.util.Scanner;
public class Input {
    public void main(String[] args) {
        Input scanner = new Input();
        String getString = scanner.getString();
        System.out.println(getString);
        boolean yesNo = scanner.yesNo();
        System.out.println(yesNo);
        int getInt = scanner.getInt(1, 10);
        System.out.println(getInt);
//        int getInt2 = scanner.getInt(10, 20);
        double getDouble = scanner.getDouble(1, 20);
        System.out.println(getDouble);
    }

    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        System.out.println("Please type something and press enter: ");
        String userInput = scanner.nextLine();
        return "'" + userInput + "'";
    }

    public static boolean yesNo() {
        System.out.println("Please input yes or no: ");
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        }else return false;
    }
//hasnextint for scanner
    public static int getInt(int min, int max) {
        System.out.println("Please enter an integer: ");
//        boolean userInput = scanner.hasNextInt();
        int userVal = scanner.nextInt();
        if ( userVal > min && userVal < max) {
            return userVal;
        }
//        }else if (!userInput){
//            return getInt(1, 10);
//        }
        else {
            return getInt(1, 10);
        }
    }

    public static int getInt() {
        System.out.println("Please enter a different integer: ");
        int userInput = scanner.nextInt();
        if (userInput < 20 && userInput > 10) {
        return userInput;
        }else return getInt(10, 20);
    }

    public static double getDouble(double min, double max) {
        System.out.println("Please enter a decimal number");
        double userInput = scanner.nextDouble();
        if (userInput > min && userInput < max)
            return userInput;
        else return getDouble(1, 20);
    }

//    public double getDouble(double min, double max) {
//        return ;
//    }

}