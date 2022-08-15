package java_two.shapes;

public class Square extends Quadrilateral {
    protected double side;
    @Override
    public double getPerimeter() {
        return 4 * length;
    }
    @Override
    public double getArea() {
        return length * length;
    }
    public Square(double length, double width) {
        super(length, width);
    }
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    public Square(double side) {
        super(side, side);
        this.length = side;
        this.width = side;
    }
}

//    private int side;
//
//    @Override
//    public int getArea() {
//        System.out.print("This is the Area override: ");
//        return length * length;
//    }
//
//    @Override
//    public int getPerimeter() {
//        System.out.print("This is the Perimeter override: ");
//        return 4 * length;
//    }
//
//    public Square(int length, int width) {
//        super(length, width);
//    }
//
//    public Square(int side) {
//        super(side, side);
//    }
//
//    public void setSide(int side) {
//        this.length = side;
//        this.width = side;
//    }

