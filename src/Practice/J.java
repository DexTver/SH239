package Practice;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), m = read.nextInt();
        int[][] mas = new int[n][m];
        int[] maxs = new int[n];

        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j){
                mas[i][j] = read.nextInt();
            }
            maxs[i] = 0;
        }

        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j){
                if (mas[i][j] > mas[i][maxs[i]]){
                    maxs[i] = j;
                }
            }
        }

        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j){
                if (maxs[i] == j) System.out.print(mas[i][j] + "# ");
                else System.out.print(mas[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}