package Massive;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0, x = 2; i < n; ++i, x += 3){
            arr[i] = x;
        }
    }
}