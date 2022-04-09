package Recursion;

import java.util.Scanner;

public class I {
    static long myMethod(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return myMethod(n - 1) + myMethod(n - 2);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(myMethod(n));
    }
}