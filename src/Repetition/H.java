package Repetition;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), ans = 0, val = 0, x;
        boolean fl = false;
        for (int i = 0; i < n; i++) {
            x = read.nextInt();
            if (x < 0) {
                if (!fl) {
                    ans = i + 1;
                    val = x;
                    fl = true;
                } else {
                    if (val < x) {
                        ans = i + 1;
                        val = x;
                    }
                }
            }
        }
        System.out.println(fl ? ans : "NO");
    }
}