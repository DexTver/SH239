package Interface;

import java.util.Scanner;

public class MyPolynom extends MyArray {

    public MyPolynom() {
        super();
    }

    public MyPolynom(double[] c, double[] x) {
        super(c, x);
    }

    public MyPolynom(double c0, double c1, double c2, double x1, double x2) {
        super(c0, c1, c2, x1, x2);
    }

    public double solve() {
        return cArr[0] + cArr[1] * xArr[0] + cArr[2] * xArr[1];
    }

    @Override
    public String toString() {
        return cArr[0] + "+" + cArr[1] + "*" + xArr[0] + "+" + cArr[2] + "*" + xArr[1] + "=" + solve();
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String[] a = r.nextLine().split(" ");
        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) arr[i] = Double.parseDouble(a[i]);
        MyPolynom myPolynom = new MyPolynom(arr[0], arr[1], arr[2], arr[3], arr[4]);
        System.out.println(myPolynom);
    }
}
