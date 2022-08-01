public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello,");
        System.out.print(" World!");
        System.out.println();

        int myFavoriteNumber = 21;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

        long myNumber = 123;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

        int num1 = 4;
        num1 += 5;
        System.out.println(num1);

        int num2 = 3;
        int num3 = 4;
        num3 *= num2;
        System.out.println(num3);

        int num4 = 10;
        int num5 = 2;
        num4 /= num5;
        num5 -= num4;
        System.out.println(num4);
        System.out.println(num5);
    }
}
