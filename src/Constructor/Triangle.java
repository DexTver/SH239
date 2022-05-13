package Constructor;

public class Triangle {
    double a, b, c;

    public Triangle() {
        this.a = this.b = this.c = 1d;
    }

    public Triangle(double a) {
        this.a = this.b = this.c = a;
    }

    public Triangle(double a, double b) {
        this.a = this.b = a;
        this.c = b;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + a + ',' + b + ',' + c + '}';
    }

    double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    double getPerimeter() {
        return a + b + c;
    }

    Triangle scale(double d) {
        return new Triangle(a * d, b * d, c * d);
    }

    Triangle scale(double dA, double dB, double dC) {
        return new Triangle(a * dA, b * dB, c * dC);
    }
}