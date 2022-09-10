package Repetition;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long a = read.nextLong(), b = read.nextLong();
        System.out.println(a * a + b * b);
    }
}