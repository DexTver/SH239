package Practice;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), ans = 0, x = 1;
        do {
            ans += x;
            x += 3;
        } while (x <= n);
        System.out.println(ans);
    }
}