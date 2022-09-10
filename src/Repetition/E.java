package Repetition;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), x, s = 0, m = 0;
        for (;n > 0; n--) {
            x = read.nextInt();
            if (Math.abs(x % 2) == 1) {
                s += x;
                m++;
            }
        }
        if (m == 0) System.out.println("NO");
        else System.out.printf("%.2f", (double) s / m);
    }
}