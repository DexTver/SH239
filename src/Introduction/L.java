package Introduction;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double ans = 0, x;
        do {
            x = read.nextDouble();
            ans += x;
        }while(x >= 0);
        ans = (double) Math.round(ans * 10) / 10;
        System.out.println(ans);
    }
}