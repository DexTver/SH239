package Practice;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int ans = 0, maxn = 101, n = read.nextInt(), x;
        for (int i = 1; i <= n; ++i){
            x = read.nextInt();
            if (x <= maxn && x > 0){
                ans = i;
                maxn = x;
            }
        }
        System.out.println((ans > 0) ? ans : "NO");
    }
}