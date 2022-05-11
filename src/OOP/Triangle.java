package OOP;

public class Triangle {
    double a, b, c;

    double getArea(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    double getPerimeter(){
        return a + b + c;
    }

    void modify(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void scale(double d){
        this.a *= d;
        this.b *= d;
        this.c *= d;
    }

    @Override
    public String toString() {
        return "Triangle{" + a + ',' + b + ',' + c + '}';
    }

    Triangle getAHalf(){
        b = this.getArea() / a;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        Triangle myTriangle = new Triangle();
        myTriangle.modify(a, b, c);
        return myTriangle;
    }

    boolean isEquilateral(){
        return (a == b) && (b == c);
    }

    boolean isIsosceles(){
        return (a == b) || (b == c) || (c == a);
    }

    boolean isRecangular(){
        boolean ans = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
        ans = ans || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
        ans = ans || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
        return ans;
    }
}