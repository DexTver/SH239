package Massive;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), ans = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = read.nextInt();
        }
        for (int x : arr) {
            if (x < 0) ans++;
        }
        System.out.println(ans);
    }
}