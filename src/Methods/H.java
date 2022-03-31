package Methods;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(myMethod(read.nextLine()));
    }

    static String myMethod(String a) {
        int n = a.length();
        if (n % 2 == 0) return a.substring(n / 2) + a.substring(0, n / 2);
        return a.substring(n / 2 + 1) + a.substring(n / 2, n / 2 + 1) + a.substring(0, n / 2);
    }
}