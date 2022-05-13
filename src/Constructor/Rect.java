package Constructor;

public class Rect {
    double width, height;

    public Rect() {
        this.width = 1d;
        this.height = 1d;
    }

    public Rect(double a) {
        this.width = a;
        this.height = a;
    }

    public Rect(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public String toString() {
        return "Rect{" + "width=" + width + ",height=" + height + '}';
    }

    boolean isSquare() {
        return height == width;
    }

    double getArea() {
        return height * width;
    }

    double getPerimeter() {
        return (height + width) * 2;
    }

    Rect scale(double d) {
        return new Rect(width * d, height * d);
    }

    Rect scale(double w, double h) {
        return new Rect(width * w, height * h);
    }
}