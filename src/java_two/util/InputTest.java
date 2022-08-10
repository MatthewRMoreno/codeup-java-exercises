package java_two.util;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
        input.yesNo();
        input.getInt(1,10);
        input.getDouble(1,30);
    }
}
