package java_two.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        Square square1 = new Square(8);
        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println("Area: " + myShape.getArea());

        myShape = new Square(6);
        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println("Area: " + myShape.getArea());
    }
}



//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("Perimeter: " + box1.getPerimeter());
//        System.out.println("Area: " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Perimeter: " + box2.getPerimeter());
//        System.out.println("Area: " + box2.getArea());
//
//        //CAST box2 to square
//        Square aSquare = (Square) box2;
//        aSquare.setSide(6);
//        System.out.println(aSquare.getPerimeter());
//        System.out.println(aSquare.getArea());
//    }
//}
