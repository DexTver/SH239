package IndividualWork;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), s = 0, y, x;
        y = read.nextInt();
        for (int i = 1; i < n; ++i){
            x = read.nextInt();
            s += x - y;
            y = x;
        }
        System.out.println((double) s / (n - 1));
    }
}