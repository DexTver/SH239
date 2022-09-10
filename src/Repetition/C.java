package Repetition;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt(), b = read.nextInt(), c = 0;
        while (a >= b) {
            c++;
            a -= b;
        }
        System.out.println(c + " " + a);
    }
}