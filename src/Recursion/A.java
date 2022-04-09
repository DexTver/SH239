package Recursion;

import java.util.Scanner;

public class A {
    static void func(int n, Scanner read){
        if (n != 0){
            func(read.nextInt(), read);
            System.out.print(n + " ");
        } else System.out.print("");
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        func(read.nextInt(), read);
    }
}