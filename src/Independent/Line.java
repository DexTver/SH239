package Independent;

public class Line {
    private double a, b, c;

    public Line(double x1, double y1, double x2, double y2) {
        this.a = y1 - y2;
        this.b = x2 - x1;
        this.c = x1 * y2 - x2 * y1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double distanceToZero() {
        return Math.abs(getC()) / Math.sqrt(getA() * getA() + getB() * getB());
    }

    public double distanceToPoint(Point o) {
        return Math.abs(o.getX() * a + o.getY() * b + c) / Math.sqrt(getA() * getA() + getB() * getB());
    }

    public boolean isParallel(Line o) {
        if (o.getA() != 0 && o.getB() != 0) {
            if (getA() == 0 || getB() == 0) {
                return false;
            } else {
                return Math.abs(getA() / o.getA() - getB() / o.getB()) < 0.0001;
            }
        } else if (o.getA() == 0) {
            return getA() == 0;
        } else if (o.getB() == 0) {
            return getB() == 0;
        } else {
            return false;
        }
    }

    public Point intersection(Line o) {
        if (isParallel(o)) {
            return null;
        }
        double x0, y0;
        x0 = (getB() * o.getC() - o.getB() * getC()) / (o.getB() * getA() - getB() * o.getA());
        y0 = (o.getA() * getC() - getA() * o.getC()) / (o.getB() * getA() - getB() * o.getA());
        // Знаменатель обнулится, когда (A1/A2 = B1/B2). Ну а это случай параллельных прямых, который мы уже
        // учли. A1 = getA(), A2 = o.getA(), B1 = getB(), B2 = o.getB().
        return new Point(x0, y0);
    }

    public Point nearPoint(Point o) {
        Line normal = new Line(o.getX(), o.getY(), o.getX() + getA(), o.getY() + getB());  //(A, B) - вектор нормали
        return intersection(normal);
    }

    public boolean oneSide(Point m, Point n) {
        double fr = m.getX() * getA() + m.getY() * getB() + getC();
        double sc = n.getX() * getA() + n.getY() * getB() + getC();
        if (Math.abs(fr) < 0.001 || Math.abs(sc) < 0.001) {
            return true;
        } else {
            return fr > 0 == sc > 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%.2fx %s %.2fy %s %.2f = 0", a, b < 0 ? "-" : "+", Math.abs(b), c < 0 ? "-" : "+", Math.abs(c));
    }
}
