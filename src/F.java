import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), x = 13;
        long ans = 1;
        do{
            ans *= x;
            x += 13;
        }while(x <= n);
        System.out.println(ans);
    }
}