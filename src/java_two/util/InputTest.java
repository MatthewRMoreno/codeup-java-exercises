package java_two.util;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println("Input a string: ");
//        input.getString();
//        System.out.println("Do you wish to continue?");
//        input.yesNo();
//        System.out.println("Please enter a number between 1-10");
//        input.getInt(1,10);
        System.out.println("Enter a double between 1-30");
        input.getDouble(1,30);
//        System.out.println("Please input a number");
//        input.getInt();
    }
}
