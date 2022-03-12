import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if (a != b) {
            if (b == c) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else {
            if (b == c) {
                System.out.println(4);
            } else{
                System.out.println(3);
            }
        }
    }
}

