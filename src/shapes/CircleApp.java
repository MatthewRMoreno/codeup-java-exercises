package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        while(true) {
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            System.out.println(circle.getArea(radius));
            System.out.println(circle.getCircumference(radius));
            boolean keepCircle = input.yesNo();
        if (keepCircle == false) {
            break;
        }
        }
    }
}