package OOPRepetition;

import java.util.Scanner;

public class Rect {
    double width, height;

    double getArea() {
        return this.height * this.width;
    }

    double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    void modify(double width, double height) {
        this.height = height;
        this.width = width;
    }

    void scale(double d) {
        this.height *= d;
        this.width *= d;
    }

    @Override
    public String toString() {
        return "Rect{" + "width=" + width + ",height=" + height + '}';
    }

    Rect getAFourth() {
        Rect myRect = new Rect();
        myRect.modify(this.width / 2, this.height / 2);
        return myRect;
    }

    Rect devide(double w, double h) {
        Rect myRect = new Rect();
        myRect.modify(this.width * w, this.height * h);
        return myRect;
    }

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
        Rect rect4 = rect1.getAFourth();
        Rect rect5 = rect2.devide(0.2, 0.5);

        System.out.println(rect3);
        System.out.println(rect4);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println(rect4);
        System.out.println(rect5);
    }
}
