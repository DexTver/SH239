package Massive;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0, x = 2; i < n; ++i, x *= 2) {
            arr[i] = x;
        }
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}