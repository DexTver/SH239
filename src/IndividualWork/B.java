package IndividualWork;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), ones = 0, doubles = 0, x;
        for (int i = 0; i < n; ++i){
            x = read.nextInt();
            if (x > 9) doubles++;
            else ones++;
        }
        if (ones > doubles) System.out.println(1);
        else if (doubles > ones) System.out.println(2);
        else System.out.println("=");
    }
}