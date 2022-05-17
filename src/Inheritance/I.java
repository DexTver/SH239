package Inheritance;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double c0 = read.nextDouble(), c1 = read.nextDouble(), c2 = read.nextDouble(), x1 = read.nextDouble(), x2 = read.nextDouble();
        MyPolynom myPolynom = new MyPolynom(c0, c1, c2, x1, x2);
        System.out.println(myPolynom);
    }
}