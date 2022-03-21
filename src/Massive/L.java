package Massive;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // not copy!
        Scanner read = new Scanner(System.in);
        int k = read.nextInt();
        int[] mas = new int[arr.length];
        for (int i = 0; i < arr.length; ++i){
            mas[(i + k) % arr.length] = arr[i];
        }
        arr = mas;
    }
}