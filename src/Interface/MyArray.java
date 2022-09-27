package Interface;

import java.util.Arrays;

public class MyArray {
    public double[] cArr;
    public double[] xArr;

    public MyArray() {
        cArr = new double[]{1d, 1d, 1d};
        xArr = new double[]{1d, 1d};
    }

    public MyArray(double[] c, double[] x) {
        cArr = c.clone();
        xArr = x.clone();
    }

    public MyArray(double c0, double c1, double c2, double x1, double x2) {
        cArr = new double[]{c0, c1, c2};
        xArr = new double[]{x1, x2};
    }

    @Override
    public String toString() {
        return "cArr=" + Arrays.toString(cArr) + "\nxArr=" + Arrays.toString(xArr);
    }

//    public static void main(String[] args) {
//        MyArray myArray = new MyArray(1, 2, 3, 4, 5);
//        System.out.println(myArray);
//    }
}
