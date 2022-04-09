package Recursion;

import java.util.Scanner;

public class G {
    static boolean func(int n, int x){
        if (x == 1) return true;
        else{
            if (n % x == 0) return false;
            else return func(n, x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(func(n, n - 1));
    }
}