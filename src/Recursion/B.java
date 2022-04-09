package Recursion;

import java.util.Scanner;

public class B {
    static int func(int n, Scanner read){
        if (n == 1) return read.nextInt();
        else return func(n - 1, read) + read.nextInt();
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(func(read.nextInt(), read));
    }
}