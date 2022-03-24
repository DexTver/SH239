package Lines;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String a = read.nextLine();
        StringBuilder sa = new StringBuilder(a);
        System.out.println(sa.reverse().toString());
    }
}