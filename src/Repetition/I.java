package Repetition;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] a = read.nextLine().split(" ");
        StringBuilder ans = new StringBuilder();
        for (String x : a) {
            String y = x.trim();
            if (y.length() > 0) {
                String l = y.substring(y.length() - 1);
                ans.append(l);
            }
        }
        System.out.println(ans);
    }
}