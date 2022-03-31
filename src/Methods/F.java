package Methods;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(myMethod(read.nextInt()));
    }

    static int myMethod(int a){
        int count = 1;
        a = Math.abs(a);
        while (a > 9){
            a /= 10;
            count++;
        }
        return count;
    }
}