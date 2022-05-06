package Practice;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double x = Math.pow(read.nextDouble(), 2), a = 1, del = 1, ans = 0;
        while (a / del >= 0.0001) {
            ans += a / del;
            a += 2;
            del *= x;
        }
        System.out.printf("%.5f", ans);
    }
}