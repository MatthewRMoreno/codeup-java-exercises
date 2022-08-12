package java_two.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Perimeter: " + box1.getPerimeter());
        System.out.println("Area: " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("Perimeter: " + box2.getPerimeter());
        System.out.println("Area: " + box2.getArea());

        //CAST box2 to square
        Square aSquare = (Square) box2;
        aSquare.setSide(6);
        System.out.println(aSquare.getPerimeter());
        System.out.println(aSquare.getArea());
    }
}
