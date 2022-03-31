package Methods;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt(), b = read.nextInt();
        System.out.println(myMethod(a, b));

    }
    static char myMethod(int x, int y){
        if (x > y) return '>';
        else if (x < y) return '<';
        else return '=';
    }
}