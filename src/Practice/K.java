package Practice;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean[] ans = new boolean[10];
        for (int i = 0; i < 10; ++i) ans[i] = false;
        char[] a = read.nextLine().toCharArray();
        for (char x : a){
            x -= '0';
            if (x >= 0 && x <= 9){
                ans[x] = true;
            }
        }
        for (int i = 0; i < 10; ++i){
            if (ans[i]) System.out.print(i);
        }
    }
}