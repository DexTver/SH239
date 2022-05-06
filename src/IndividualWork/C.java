package IndividualWork;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt(), min = 10;
        boolean fl = false;
        int[] mas = {a / 1000, (a % 1000) / 100, (a % 100) / 10, a % 10};
        for (int x : mas) {
            if (x < min) {
                min = x;
                fl = false;
            } else if (x == min) {
                fl = true;
            }
        }
        System.out.println(min);
        if (fl) {
            System.out.println(">1");
        }
    }
}