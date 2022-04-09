package Recursion;

import java.util.Scanner;

public class D {
    static void func(char x, int n) {
        if (n == 0) System.out.print((char) (x + n));
        else {
            func(x, n - 1);
            System.out.print((char) (x + n));
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String inp = read.nextLine();
        char x = inp.charAt(0);
        int n = Integer.parseInt(inp.substring(1));
        func(x, n - 1);
    }
}