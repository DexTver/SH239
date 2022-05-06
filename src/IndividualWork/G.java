package IndividualWork;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), k = 0, x = 1;
        while (x * 2 <= n){
            k++;
            x *= 2;
        }
        System.out.println(k);
    }
}