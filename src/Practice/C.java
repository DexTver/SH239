package Practice;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int last = x % 10, prelast = x % 100 / 10, firstpair = x / 100;
        boolean ans = (last * 10 + prelast) == firstpair;
        System.out.println(ans ? "YES" : "NO");
    }
}