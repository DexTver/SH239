import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        double x;
        if (a == 0) {
            if (b <= 0){
            System.out.println("no such x");}
            else{
                System.out.println("any x");
            }
        } else if (a > 0) {
            x = (double)Math.round(((double) (-b) / a) * 10) / 10; //round
            if (x < 0) {
                System.out.println("any x");
            } else {
                System.out.printf("x<%s or x>%s%n", -x, x);
            }
        } else {
            x = (double)Math.round(((double) (-b) / a) * 10) / 10;
            if (x <= 0){
                System.out.println("no such x");
            }
            else{
                System.out.printf("%s<x<%s%n", -x, x);
            }
        }
    }
}
