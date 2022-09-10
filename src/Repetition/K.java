package Repetition;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble(), b = read.nextDouble(), c;
        if (a == 0) {
            if (b == 0) System.out.println("any x");
            else System.out.println("no such x");
        } else {
            c = -b / a;
            if (c < 0) System.out.println("no such x");
            else if (c == 0) System.out.printf("%.1f", Math.abs(c));
            else System.out.printf("%.1f %.1f", -Math.sqrt(c), Math.sqrt(c));
        }
    }
}