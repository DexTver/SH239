package Methods;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String a = read.next();
        myMethod(a, n);
    }

    static void myMethod(String a, int n){
        for (int i = 0; i < n; ++i){
            System.out.println(a);
        }
    }
}