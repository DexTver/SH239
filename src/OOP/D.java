package OOP;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Triangle triangle = new Triangle(), triangle2 = new Triangle();
        double a = read.nextDouble(), b = read.nextDouble(), c = read.nextDouble();
        triangle.modify(a, b, c);
        double a2 = read.nextDouble(), b2 = read.nextDouble(), c2 = read.nextDouble();
        triangle2.modify(a2, b2, c2);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle2.getArea());
        System.out.println(triangle2.getPerimeter());
        Triangle triangle3 = new Triangle();
        triangle3.modify(a, b, c);
        triangle3.scale(2);
        System.out.println(triangle3.getArea());
        System.out.println(triangle3.toString());
        Triangle triangle4 = triangle2.getAHalf();
    }
}