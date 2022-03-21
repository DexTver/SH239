package Massive;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = n - i;
        }
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}