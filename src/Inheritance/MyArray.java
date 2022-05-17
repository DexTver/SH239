package Inheritance;

public class MyArray {
    double[] cArr;
    double[] xArr;

    public MyArray() {
        cArr = new double[3];
        xArr = new double[2];
        cArr[0] = cArr[1] = cArr[2] = xArr[0] = xArr[1] = 1;
    }

    public MyArray(double[] cArr, double[] xArr) {
        this.cArr = new double[3];
        this.xArr = new double[2];
        for (int i = 0; i < 3; ++i) this.cArr[i] = cArr[i];
        for (int i = 0; i < 2; ++i) this.xArr[i] = xArr[i];
    }

    public MyArray(double c0, double c1, double c2, double x1, double x2) {
        this.cArr = new double[3];
        this.xArr = new double[2];
        cArr[0] = c0;
        cArr[1] = c1;
        cArr[2] = c2;
        xArr[0] = x1;
        xArr[1] = x2;
    }

    @Override
    public String toString() {
        return "cArr=[" + cArr[0] + ", " + cArr[1] + ", " + cArr[2] + "]\nxArr=[" + xArr[0] + ", " + xArr[1] + ']';
    }
}