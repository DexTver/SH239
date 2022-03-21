package Massive;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), x = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = x;
        }
    }
}