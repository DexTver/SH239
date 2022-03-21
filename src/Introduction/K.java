package Introduction;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = (read.nextInt() + 4) / 5;
        switch(n){
            case 1:
                System.out.println("0<n<=5");
                break;
            case 2:
                System.out.println("5<n<=10");
                break;
            case 3:
                System.out.println("10<n<=15");
                break;
        }
    }
}