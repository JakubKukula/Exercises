package java_study.day20.enums;

public class Main {
    public static void main(String[] args) {

        System.out.println(Shape.SQUARE.area(3));         // 9
        System.out.println(Shape.CIRCLE.area(1));         // 3.14159  (wystarczy w przybliżeniu)
        System.out.println(Shape.TRIANGLE.area(2));       // 1.73205  (wystarczy w przybliżeniu)
        System.out.println(Shape.fromCode('T'));             // TRIANGLE
        System.out.println(Shape.largest(2));             // 12.56636
        // Shape.fromCode('x')     → IllegalArgumentException("Wrong char")
        // Shape.SQUARE.area(0)    → IllegalArgumentException("Number cannot be less than 0")

    }
}
