package Independent;

public class Point {
    public double x, y;

    public Point() {
        this.x = this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceToZero() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    public double distanceTo(Point o) {
        double dx, dy;
        dx = Math.abs(getX() - o.getX());
        dy = Math.abs(getY() - o.getY());
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", getX(), getY());
    }
}
