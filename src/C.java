import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a == 0) System.out.println("no such x");
        else if (a > 0) System.out.println(String.format("x<%d or x>%d", 2, 3));
    }
}
