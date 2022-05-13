package Constructor;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a1 = read.nextDouble(), a2 = read.nextDouble(), b2 = read.nextDouble();
        double a3 = read.nextDouble(), b3 = read.nextDouble(), c3 = read.nextDouble();

        Triangle triangle1 = new Triangle(a1), triangle2 = new Triangle(a2, b2);
        Triangle triangle3 = new Triangle(a3, b3, c3), triangle4 = new Triangle();
        Triangle triangle5 = triangle1.scale(2.5);
        Triangle triangle6 = triangle2.scale(0.85, 0.8, 0.9);

        System.out.print(triangle1.getArea() + " " + triangle2.getArea() + " " + triangle5.getArea() + " ");
        System.out.println(triangle6.getArea() + "\n" + triangle5.getPerimeter() + " " + triangle6.getPerimeter());
    }
}