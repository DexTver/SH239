package OOPRepetition;

import java.util.Scanner;

public class Triangle {
    double a, b, c;

    double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    double getPerimeter() {
        return a + b + c;
    }

    void modify(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void scale(double d) {
        this.a *= d;
        this.b *= d;
        this.c *= d;
    }

    @Override
    public String toString() {
        return "Triangle{" + a + ',' + b + ',' + c + '}';
    }

    Triangle getAHalf() {
        double b1 = this.getArea() / a;
        double c1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b1, 2));
        Triangle myTriangle = new Triangle();
        myTriangle.modify(a, b1, c1);
        return myTriangle;
    }

    boolean isEquilateral() {
        return (a == b) && (b == c);
    }

    boolean isIsosceles() {
        return (a == b) || (b == c) || (c == a);
    }

    boolean isRecangular() {
        boolean ans = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
        ans = ans || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
        ans = ans || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Triangle triangle1 = new Triangle(), triangle2 = new Triangle();
        double a = read.nextDouble(), b = read.nextDouble(), c = read.nextDouble();
        triangle1.modify(a, b, c);
        double a1 = read.nextDouble(), b1 = read.nextDouble(), c1 = read.nextDouble();
        triangle2.modify(a1, b1, c1);

        System.out.println(triangle1.getArea());
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle2.getArea());
        System.out.println(triangle2.getPerimeter());

        Triangle triangle3 = new Triangle();
        triangle3.modify(a, b, c);
        triangle3.scale(2);

        System.out.println(triangle3.getArea());
        System.out.println(triangle3);

        Triangle triangle4 = triangle2.getAHalf();

        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println(triangle3);
        System.out.println(triangle4);
    }
}