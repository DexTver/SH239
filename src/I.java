import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        n *= n;
        int n4 = n * n;
        System.out.println(n4);
        System.out.println(n4 * n);
        System.out.println(n4 * n4);
    }
}