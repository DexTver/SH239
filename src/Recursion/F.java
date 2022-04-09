package Recursion;

import java.util.Scanner;

public class F {
    static boolean myMethod(int a, int b){
        if (a >= b) return myMethod(a - b, b);
        else return a == 0;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt(), b = read.nextInt();
        System.out.println(myMethod(a, b));
    }
}