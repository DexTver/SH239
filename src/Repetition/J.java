package Repetition;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = read.nextInt();
        boolean fl = true;
        for (int x : a) if (x <= 0) fl = false;
        System.out.println(fl ? "YES" : "NO");
    }
}