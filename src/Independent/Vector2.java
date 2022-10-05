package Independent;

public class Vector2 {
    private double x, y;

    public Vector2() {
        x = 1;
        y = 0;
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(Vector2 vector) {
        this.x = vector.getX();
        this.y = vector.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double len() {
        return Math.sqrt(x * x + y * y);
    }

    public void x(double k) {
        this.x *= k;
        this.y *= k;
    }

    public void plus(Vector2 vector) {
        this.x += vector.getX();
        this.y += vector.getY();
    }

    public void minus(Vector2 vector) {
        this.x -= vector.getX();
        this.y -= vector.getY();
    }

    public Vector2 sum(Vector2 vector) {
        return new Vector2(this.x + vector.getX(), this.y + vector.getY());
    }

    public static Vector2 sum(Vector2 vector1, Vector2 vector2) {
        return new Vector2(vector1.getX() + vector2.getX(), vector1.getY() + vector2.getY());
    }

    public Vector2 mult(double k) {
        return new Vector2(this.x * k, this.y * k);
    }

    public static Vector2 mult(Vector2 vector, double k) {
        return new Vector2(vector.getX() * k, vector.getY() * k);
    }

    public double mult(Vector2 vector) {
        return (this.x * vector.getX() + this.y * vector.getY());
    }

    public static double mult(Vector2 vector1, Vector2 vector2) {
        return (vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY());
    }

    public void normalize() {
        double k = len();
        if (k != 0) {
            this.x /= k;
            this.y /= k;
        }
    }

    public Vector2 norm() {
        double k = len();
        if (k == 0) {
            return new Vector2(0d, 0d);
        }
        return new Vector2(this.x / len(), this.y / len());
    }

    public void rotate(double ang) {
        double x = this.x;
        double y = this.y;
        this.x = x * Math.cos(ang) - y * Math.sin(ang);
        this.y = x * Math.sin(ang) + y * Math.cos(ang);
    }

    public Vector2 rotated(double ang) {
        return new Vector2(x * Math.cos(ang) - y * Math.sin(ang), x * Math.sin(ang) + y * Math.cos(ang));
    }

    public Vector2 ort() {
        Vector2 vector = norm();
        vector.rotate(Math.PI / 2);
        return vector;
    }

    public double phi() {
        return Math.atan(y / x);
    }

    public int getQuarte() {
        if (x > 0 && y > 0) return 1;
        if (x < 0 && y > 0) return 2;
        if (x < 0 && y < 0) return 3;
        if (x > 0 && y < 0) return 4;
        return 0;
    }

    public boolean equals(Vector2 o) {
        return (this.x == o.getX() && this.y == o.getY());
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f)", x, y);
    }
}
