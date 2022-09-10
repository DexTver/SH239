package Repetition;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble(), b = read.nextDouble(), c;
        c = -(b / a);
        if (a < 0) {
            if (c <= 0) System.out.println("no such x");
            else {
                System.out.printf("%.1f", -c);
                System.out.print("<x<");
                System.out.printf("%.1f", c);
            }
        } else if (a == 0) {
            if (b > 0) System.out.println("any x");
            else System.out.println("no such x");
        } else {
            if (c < 0) System.out.println("any x");
            else {
                System.out.print("x<");
                System.out.printf("%.1f", -c);
                System.out.print(" or x>");
                System.out.printf("%.1f", c);
            }
        }
    }
}