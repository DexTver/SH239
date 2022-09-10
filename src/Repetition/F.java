package Repetition;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), c;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = read.nextInt();
        for (int i = 0; i < (n / 2); i++) {
            c = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = c;
        }
        for (int x : a) System.out.print(x + " ");
    }
}