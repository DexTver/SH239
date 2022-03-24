package Lines;

import java.util.Scanner;

import static java.lang.Math.min;

public class E {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String a = read.nextLine();
        int k = min(a.length(), 5);
        System.out.println(a.substring(0, k));
    }
}