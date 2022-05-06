package Practice;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int quotient = 0, a = read.nextInt(), b = read.nextInt();
        while (a >= b){
            quotient++;
            a -= b;
        }
        System.out.println(quotient + " " + a);
    }
}