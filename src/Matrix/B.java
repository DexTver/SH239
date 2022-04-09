package Matrix;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), c;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = read.nextInt();
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                c = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = c;
            }
        }
        for (int[] mas : arr){
            for (int x : mas){
                System.out.print(x + " ");
            }
            System.out.print("\n");
        }
    }
}