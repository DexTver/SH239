package Inheritance;

public class MyPolynom extends MyArray {

    public MyPolynom() {
        super();
    }

    public MyPolynom(double[] cArr, double[] xArr) {
        super(cArr, xArr);
    }

    public MyPolynom(double c0, double c1, double c2, double x1, double x2) {
        super(c0, c1, c2, x1, x2);
    }

    double solve() {
        return cArr[0] + cArr[1] * xArr[0] + cArr[2] * xArr[1];
    }

    @Override
    public String toString() {
        return cArr[0] + "+" + cArr[1] + '*' + xArr[0] + '+' + cArr[2] + '*' + xArr[1] + '=' + this.solve();
    }
}