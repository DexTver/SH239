package Introduction;

import java.util.Scanner;

import static java.lang.Math.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(abs(a - b));
        System.out.println((int) pow(abs(a - b), 2));
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
