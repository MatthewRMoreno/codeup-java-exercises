package java_two.shapes;

import java_two.util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        while(true) {
            System.out.println("Please input a radius: ");
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            System.out.println("Area: " + circle.getArea(radius));
            System.out.println("Circumference " + circle.getCircumference(radius));
            System.out.println("Make another circle?");
            boolean keepCircle = input.yesNo();
        if (keepCircle == false) {
            break;
        }
        }
    }
}
