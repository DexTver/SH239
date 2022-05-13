package Constructor;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble(), b = read.nextDouble(), c = read.nextDouble(), d = read.nextDouble();
        Rect rect1 = new Rect(a, b), rect2 = new Rect(c, d);

        System.out.println(rect1.getPerimeter());
        System.out.println(rect1.getArea());
        System.out.println(rect2.getPerimeter());
        System.out.println(rect2.getArea());

        System.out.println(rect2.isSquare() ? "YES" : "NO");

        Rect rect3 = rect1.scale(2.5), rect4 = rect1.scale(0.2, 0.5);
        System.out.println(rect4.toString());
    }
}