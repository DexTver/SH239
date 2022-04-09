package Matrix;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= n; ++j){
                arr[i - 1][j - 1] = i * j;
            }
        }
        for (int mas[] : arr){
            for (int x : mas){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}