package Massive;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        long ans = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = read.nextInt();
        }
        for (int x : arr) {
            ans *= (long) x;
        }
        System.out.print(ans);
    }
}