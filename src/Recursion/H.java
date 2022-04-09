package Recursion;

import java.util.Scanner;

public class H {
    static void func(int n){
        if (n == 1) System.out.println("*");
        else{
            func(n - 1);
            System.out.println("*".repeat(n));
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        func(n);
    }
}