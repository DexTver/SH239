package Practice;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt(), b = read.nextInt(), ans = 0;
        while (a > b){
            a -= b;
            System.out.print(a + " ");
            ans++;
        }
        System.out.println("\n"+ ans);
    }
}