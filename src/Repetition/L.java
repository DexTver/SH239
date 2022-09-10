package Repetition;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char[] a = read.nextLine().toCharArray();
        boolean last_is_chr = false;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                if (last_is_chr) {
                    ans.append(',');
                    last_is_chr = false;
                }
                ans.append(a[i]);
                continue;
            }
            last_is_chr = true;
            ans.append(a[i]);
        }
        if (last_is_chr) ans.append(',');
        System.out.println(ans);
    }
}