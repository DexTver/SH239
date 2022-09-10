package Repetition;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        System.out.println((int) Math.ceil(Math.log(a + 1) / Math.log(2)));
    }
}