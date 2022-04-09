package Recursion;

import java.util.Scanner;

public class E {
    static void myMethod(int a, int x){
        if (x != a) myMethod(a, x - 1);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt(), b = read.nextInt();
        myMethod(a, b);
    }
}