package Recursion;

import java.util.Scanner;

public class C {
    static int func(int n, Scanner read){
        if (n == 1) return read.nextInt();
        else return Math.min(read.nextInt(), func(n - 1, read));
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(func(read.nextInt(), read));
    }
}