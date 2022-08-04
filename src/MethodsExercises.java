import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //Ask for 2 numbers
        System.out.println("Please input 2 numbers");
        System.out.println("First Number: ");
        int first = scanner.nextInt();
        System.out.println("Second Number: ");
        int second = scanner.nextInt();

        //Create 4 different Methods
        System.out.println(first +"+"+ second + "=" + Addition(first, second));
        System.out.println(first +"-"+ second + "=" + Subtraction(first, second));
        System.out.println(first +"x"+ second + "=" + Multiplication(first, second));
        System.out.println(first +"/"+ second + "=" + Division(first, second));
        System.out.println(Modulus(first, second));

        //ask for 2 numbers
        System.out.println("Please input 2 numbers");
        System.out.println("First Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Second Number: ");
        int number2 = scanner.nextInt();
        //getInteger method goes here
        System.out.println(getInteger(number1, number2));

    }
    //create the addition method
    public static int Addition(int x, int y) {
        return  x + y;
    }
    //create the subtraction method
    public static int Subtraction(int x, int y) {
         return x-y;
    }
    //create the multiplication method
    public static int Multiplication(int x, int y) {
        //normal method
//        x * y;
        //with no multiplication sign
//        int result = 0;
//        for (int i = 0; i < x; i++) {
//            result += y;
//        }
//        return result;
        //using recursion
        if ((x==0) || (y==0)) {
            return 0;
        }else
            return (x + Multiplication(x, y-1));
    }
    //create the division method
    public static int Division(int x, int y) {
        if (y==0 || x==0){
            return 0;
        }else return x/y;
    }
    //create modulus method
    public static int Modulus(int x, int y) {
        return x%y;
    }
    //create a method that validates if it meets certain criteria
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between " + min + "-" + max);
        int userInput = scanner.nextInt();
        if(userInput>min && userInput<max) {
            return userInput;
        }
        return getInteger(min, max);
    };
    //calculate the factorial of a number
//    public static int Factorial() {
//
//    }


}
