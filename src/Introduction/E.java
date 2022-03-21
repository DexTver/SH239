package Introduction;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), x = 99;
        do {
            System.out.print(++x + " ");
        }while(((x % n) != 0) || ((x % 3) != 0));
    }
}