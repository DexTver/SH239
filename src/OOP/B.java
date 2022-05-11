package OOP;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble(), b = read.nextDouble(), c = read.nextDouble();
        Rect rect1 = new Rect(), rect2 = new Rect();
        rect1.modify(a, b);
        rect2.modify(c, c);

        System.out.println(rect1.getPerimeter());
        System.out.println(rect1.getArea());
        System.out.println(rect2.getPerimeter());
        System.out.println(rect2.getArea());

        Rect rect3 = rect1.devide(2.5, 2.5);
        Rect rect4 = rect1.devide(0.25, 0.25);
        Rect rect5 = rect2.devide(0.2, 0.5);

        System.out.println(rect3.toString());
        System.out.println(rect4.toString());
    }
}